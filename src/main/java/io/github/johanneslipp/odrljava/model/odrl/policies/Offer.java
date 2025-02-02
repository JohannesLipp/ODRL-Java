package io.github.johanneslipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Offer extends Policy<Offer> {
    @JsonProperty("@type")
    private final String type = "Offer";

    public Offer() {
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
