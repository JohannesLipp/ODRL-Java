package io.github.johanneslipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UndefinedTerm {
    @JsonProperty("@type")
    private final String type = "UndefinedTerm";

    public UndefinedTerm() {
    }
}
