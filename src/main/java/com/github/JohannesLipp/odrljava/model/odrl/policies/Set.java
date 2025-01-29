package com.github.JohannesLipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Set extends Policy<Set> {
    @JsonProperty("@type")
    private final String type = "Set";
    
    public Set() {
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Set set = (Set) o;
        return Objects.equals(type, set.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Set{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
