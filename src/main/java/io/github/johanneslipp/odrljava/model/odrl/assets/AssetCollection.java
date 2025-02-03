package io.github.johanneslipp.odrljava.model.odrl.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;

import java.util.Set;

public class AssetCollection extends Asset {
    @JsonProperty("@type")
    private final String type = "AssetCollection";

    @JsonProperty("source")
    private AssetCollection source;

    @JsonProperty("refinement")
    private Set<AbstractConstraint> refinement;

    public AssetCollection() {
    }

    @Override
    public String getType() {
        return type;
    }

    public AssetCollection getSource() {
        return source;
    }

    public AssetCollection setSource(AssetCollection source) {
        this.source = source;
        return this;
    }

    public Set<AbstractConstraint> getRefinement() {
        return refinement;
    }

    public AssetCollection setRefinement(Set<AbstractConstraint> refinement) {
        this.refinement = refinement;
        return this;
    }
}
