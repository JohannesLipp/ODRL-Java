package com.github.JohannesLipp.odrljava.model.odrl.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;

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
}
