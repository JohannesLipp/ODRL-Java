package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class Prohibition extends Rule {
    @JsonProperty("@type")
    private final String type = "Prohibition";

    @JsonProperty("remedy")
    private Set<Duty> remedy;

    public Prohibition() {
    }
}
