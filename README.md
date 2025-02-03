# ODRL-Java
All Open Digital Rights Language (ODRL) classes and properties as Java representations, with native JSON-LD (de-)serialization.

In sync with [ODRL Information Model 2.2](https://www.w3.org/TR/2018/REC-odrl-model-20180215/).

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