package io.github.johanneslipp.odrljava.model.skos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.johanneslipp.odrljava.utils.Constants;

public class Collection {
    @JsonProperty("@type")
    private static final String type = Constants.SKOS_URI + "Collection";
}
