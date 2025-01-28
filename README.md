# ODRL-Java
All Open Digital Rights Language (ODRL) classes and properties as Java representations, with native JSON-LD (de-)serialization.

In sync with [ODRL Information Model 2.2](https://www.w3.org/TR/2018/REC-odrl-model-20180215/).

## Limitations
- `odrl:uid` is assumed to be String
- Not supporting deprecated terms in general 
- Only simple actions supported, thus not supporting constructs using `odrl:includedIn` / `odrl:implies` / `odrl:refinement`
- Not supporting `odrl:function`. A full list: `attributedParty`, `attributingParty`, `consentingParty`, `consentedParty`, `informedParty`, `informingParty`, `payeeParty`, `compensatedParty`, `compensatingParty`, `trackingParty`, `trackedParty`, `contractingParty`, `contractedParty`
- `odrl:rightOperand` only supporting direct format, no `@id` references. Supported example: `{"@value": "online", "@type": "xsd:string"}`