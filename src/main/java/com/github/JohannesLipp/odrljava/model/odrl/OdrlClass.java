package com.github.JohannesLipp.odrljava.model.odrl;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class OdrlClass {
    @JsonProperty("@context")
    private final String context = "http://www.w3.org/ns/odrl.jsonld";

    public String getContext() {
        return context;
    }
}
