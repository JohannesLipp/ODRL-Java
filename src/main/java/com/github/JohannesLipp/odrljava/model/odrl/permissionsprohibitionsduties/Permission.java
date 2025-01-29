package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class Permission extends Rule {
    @JsonProperty("@type")
    private final String type = "Permission";

    @JsonProperty("duty")
    private Set<Duty> duty;

    public Permission() {
    }

    public String getType() {
        return type;
    }
}
