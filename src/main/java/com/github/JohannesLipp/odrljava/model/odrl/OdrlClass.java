package com.github.JohannesLipp.odrljava.model.odrl;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OdrlClass {
    @JsonProperty("@context")
    private final String context = "http://www.w3.org/ns/odrl.jsonld";
}
