package com.github.JohannesLipp.odrljava.model.odrl.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;

import java.util.Set;

public class Asset {
    @JsonProperty("@type")
    private final String type = "Asset";

    @JsonProperty("partOf")
    private Set<AssetCollection> partOf;

    @JsonProperty("hasPolicy")
    private Set<Policy<?>> hasPolicy;

    @JsonProperty("uid")
    private String uid;

    public Asset() {
    }

    public String getType() {
        return type;
    }

    public Set<AssetCollection> getPartOf() {
        return partOf;
    }

    public Asset setPartOf(Set<AssetCollection> partOf) {
        this.partOf = partOf;
        return this;
    }

    public Set<Policy<?>> getHasPolicy() {
        return hasPolicy;
    }

    public Asset setHasPolicy(Set<Policy<?>> hasPolicy) {
        this.hasPolicy = hasPolicy;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public Asset setUid(String uid) {
        this.uid = uid;
        return this;
    }
}
