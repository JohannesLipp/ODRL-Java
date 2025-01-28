package com.github.JohannesLipp.odrljava.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RightOperandId {
    @JsonProperty("@id")
    private String id;

    public RightOperandId() {
    }

    public RightOperandId(String id) {
        this.id = id;
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
