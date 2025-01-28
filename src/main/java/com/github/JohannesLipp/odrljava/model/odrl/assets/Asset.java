package com.github.JohannesLipp.odrljava.model.odrl.assets;

import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Asset")
public class Asset {
    @JsonldProperty("odrl:partOf")
    private Set<AssetCollection> partOf;

    @JsonldProperty("odrl:hasPolicy")
    private Set<Policy> hasPolicy;

    @JsonldProperty("odrl:uid")
    private String uid;

    public Asset() {
    }
}
