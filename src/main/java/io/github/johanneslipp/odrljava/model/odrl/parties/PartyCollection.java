package io.github.johanneslipp.odrljava.model.odrl.parties;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;

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

    @Override
    public String getType() {
        return type;
    }

    public PartyCollection getSource() {
        return source;
    }

    public PartyCollection setSource(PartyCollection source) {
        this.source = source;
        return this;
    }

    public Set<AbstractConstraint> getRefinement() {
        return refinement;
    }

    public PartyCollection setRefinement(Set<AbstractConstraint> refinement) {
        this.refinement = refinement;
        return this;
    }
}
