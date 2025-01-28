package com.github.JohannesLipp.odrljava.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TypedValue {
    @JsonProperty("@value")
    private String value;

    @JsonProperty("@type")
    private String type;

    public TypedValue() {
    }

    public TypedValue(String value, String type) {
        this.value = value;
        this.type = type;
    }

    // Getter und Setter
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
