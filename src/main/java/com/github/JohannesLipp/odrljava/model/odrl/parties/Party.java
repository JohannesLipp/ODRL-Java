package com.github.JohannesLipp.odrljava.model.odrl.parties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;

import java.util.Set;

public class Party {
    @JsonProperty("@type")
    private final String type = "Party";

    @JsonProperty("partOf")
    private Set<PartyCollection> partOf;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("assigneeOf")
    private Policy assigneeOf;

    @JsonProperty("assignerOf")
    private Policy assignerOf;

    public Party() {
    }

    public String getType() {
        return type;
    }

    public Set<PartyCollection> getPartOf() {
        return partOf;
    }

    public Party setPartOf(Set<PartyCollection> partOf) {
        this.partOf = partOf;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public Party setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Policy getAssigneeOf() {
        return assigneeOf;
    }

    public Party setAssigneeOf(Policy assigneeOf) {
        this.assigneeOf = assigneeOf;
        return this;
    }

    public Policy getAssignerOf() {
        return assignerOf;
    }

    public Party setAssignerOf(Policy assignerOf) {
        this.assignerOf = assignerOf;
        return this;
    }
}
