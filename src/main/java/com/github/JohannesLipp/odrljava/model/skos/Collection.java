package com.github.JohannesLipp.odrljava.model.skos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.utils.Constants;

public class Collection {
    @JsonProperty("@type")
    private static final String type = Constants.SKOS_URI + "Collection";
}
