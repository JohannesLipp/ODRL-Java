package com.github.JohannesLipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Set extends Policy {
    @JsonProperty("@type")
    private final String type = "Set";
    
    public Set() {
    }

    public String getType() {
        return type;
    }
}
