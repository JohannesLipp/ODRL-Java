package com.github.JohannesLipp.odrljava.model.cc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.utils.Constants;

public class Sharing {
    @JsonProperty("@type")
    private static final String type = Constants.CC_URI + "Sharing";
}
