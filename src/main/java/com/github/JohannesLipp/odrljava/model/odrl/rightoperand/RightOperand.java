package com.github.JohannesLipp.odrljava.model.odrl.rightoperand;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RightOperand {
    @JsonProperty("@type")
    private final String type = "RightOperand";
    @JsonProperty("@value")
    private String value;

    public RightOperand() {
    }
}
