package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Action")
public enum Action {
//    @JsonldProperty("odrl:includedIn")
//    private Set<Action> includedIn;
//
//    @JsonldProperty("odrl:implies")
//    private Set<Action> implies;
//
//    @JsonldProperty("odrl:refinement")
//    private Set<AbstractConstraint> refinement;

    use, grantUse, compensate, acceptTracking, aggregate, annotate, anonymize, archive, attribute, concurrentUse, delete, derive, digitize, display, distribute, ensureExclusivity, execute, extract, give, include, index, inform, install, modify, move, nextPolicy, obtainConsent, play, present, print, read, reproduce, reviewPolicy, sell, stream, synchronize, textToSpeech, transfer, transform, translate, uninstall, watermark
}
