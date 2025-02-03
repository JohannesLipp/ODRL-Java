package io.github.johanneslipp.odrljava.model.cc;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.johanneslipp.odrljava.utils.Constants;

public class Attribution {
    @JsonProperty("@type")
    private static final String type = Constants.CC_URI + "Attribution";
}
