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
}
