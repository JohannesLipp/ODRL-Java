package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class Duty extends Rule {
    @JsonProperty("@type")
    private final String type = "Duty";

    @JsonProperty("consequence")
    private Set<Duty> consequence;

    public Duty() {
    }
}
