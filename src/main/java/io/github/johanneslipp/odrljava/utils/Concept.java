package io.github.johanneslipp.odrljava.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Concept {
    @JsonProperty("@type")
    private static final String type = Constants.SKOS_URI + "Concept";
}
