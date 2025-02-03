# ODRL-Java
All Open Digital Rights Language (ODRL) classes and properties as Java representations, with native JSON-LD (de-)serialization.

In sync with [ODRL Information Model 2.2](https://www.w3.org/TR/2018/REC-odrl-model-20180215/).

## Usage
ODRL instances (Policies, Agreements, etc.) can be instantiated as Java classes manually or via JSON-LD deserialization, and serialized to JSON-LD.  

Use the recommended JSON-LD mapper from [Demo.java](src/main/java/io/github/johanneslipp/odrljava/Demo.java) or set up a customized one:
```java
ObjectMapper mapper = new ObjectMapper();
mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
mapper.enable(SerializationFeature.INDENT_OUTPUT);
mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
```

### Serialize
Create ODRL instances in Java and serialize to JSON-LD (see [Demo.java](src/main/java/io/github/johanneslipp/odrljava/Demo.java)):

```java
// Create ODRL-Java instance, e.g. via setter builder pattern
Constraint constraint = new Constraint()
    .setLeftOperand(LeftOperand.dateTime)
    .setOperator(Operator.lt)
    .setRightOperand(new RightOperand()
        .setValue("2018-01-01")
        .setType("xsd:date"));

Permission permission = new Permission()
    .setTarget(URI.create("http://example.com/document:1234"))
    .setAssigner(URI.create("http://example.com/org:616"))
    .setAction(Action.distribute)
    .setConstraint(Collections.singletonList(constraint));

Offer offer = new Offer()
    .setUid("http://example.com/policy:6163")
    .setProfile(URI.create("http://example.com/odrl:profile:10"))
    .setPermission(Collections.singletonList(permission));

// Serialize ODRL-Java to JSON-LD
System.out.println(mapper.writeValueAsString(offer));
```

### Deserialize (based on Example 04)
Deserialize JSON-LD to ODRL-Java instances and work with them (see [Demo.java](src/main/java/io/github/johanneslipp/odrljava/Demo.java)):

```java
// Create JSON-LD content (can also be read from file, e.g. via `mapper.readValue(URI uri, Offer.class)`
String example04 = """
    {
       "@context": "http://www.w3.org/ns/odrl.jsonld",
       "@type": "Offer",
       "uid": "http://example.com/policy:3333",
       "profile": "http://example.com/odrl:profile:02",
       "permission": [{
           "target": "http://example.com/asset:3333",
           "action": "display",
           "assigner": "http://example.com/party:0001"
       }]
    }""";

// Deserialize JSON-LD to ODRL-Java
Offer offer = mapper.readValue(example04, Offer.class);

// Use ODRL-Java, e.g. read fields via Getters
System.out.println("Profile: " + offer.getProfile());
System.out.println("Action: " + offer.getPermission().getFirst().getAction().getFirst());
```

## Tests
All 35 examples from the above-mentioned ODRL specification are supported, excluding some explicit exceptions due to the following limitations.
See [the extracted ODRL examples in test resources](src/test/resources) and the [JUnit deserialization tests in DeSerializationTests.java](src/test/java/io/github/johanneslipp/odrljava/DeSerializationTests.java). 

## Limitations
- `uid` is assumed to be String
- Not supporting deprecated terms in general 
- Only simple actions supported, thus not supporting constructs using `includedIn` / `implies` / `refinement`
- Not supporting `function`. A full list: `attributedParty`, `attributingParty`, `consentingParty`, `consentedParty`, `informedParty`, `informingParty`, `payeeParty`, `compensatedParty`, `compensatingParty`, `trackingParty`, `trackedParty`, `contractingParty`, `contractedParty`
- `rightOperand` only supporting direct format, no `@id` references. Supported example: `{"@value": "online", "@type": "xsd:string"}`
- For the following properties, only URIs are supported (no complex objects such as `AssetCollection`)
  - `target`, `profile`, `assignee`, `assigner` properties of `Policy`
  - `assigner` and `assignee` properties of `Rule`
  - `inheritFrom`  property of `Agreement`