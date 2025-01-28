package com.github.JohannesLipp.odrljava.model.odrl.parties;

import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Party")
public class Party {
    @JsonldProperty("odrl:partOf")
    private Set<PartyCollection> partOf;

    @JsonldProperty("odrl:uid")
    private String uid;

    @JsonldProperty("odrl:assigneeOf")
    private Policy assigneeOf;

    @JsonldProperty("odrl:assignerOf")
    private Policy assignerOf;

    public Party() {
    }
}
