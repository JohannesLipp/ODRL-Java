package com.github.JohannesLipp.odrljava.model.odrl.parties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;

import java.util.Set;

public class PartyCollection extends Party {
    @JsonProperty("@type")
    private final String type = "PartyCollection";

    @JsonProperty("source")
    private PartyCollection source;

    @JsonProperty("refinement")
    private Set<AbstractConstraint> refinement;

    public PartyCollection() {
    }


}
