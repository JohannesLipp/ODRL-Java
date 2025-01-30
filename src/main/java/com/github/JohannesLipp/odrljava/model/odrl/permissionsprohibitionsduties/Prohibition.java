package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Prohibition extends Rule<Prohibition> {
    @JsonProperty("@type")
    private final String type = "Prohibition";

    @JsonProperty("remedy")
    private List<Duty> remedy;

    public Prohibition() {
    }

    @Override
    public String getType() {
        return type;
    }

    public List<Duty> getRemedy() {
        return remedy;
    }

    public Prohibition setRemedy(List<Duty> remedy) {
        this.remedy = remedy;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Prohibition that = (Prohibition) o;
        return Objects.equals(type, that.type) && Objects.equals(remedy, that.remedy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, remedy);
    }

    @Override
    public String toString() {
        return "Prohibition{" +
                "type='" + type + '\'' +
                ", remedy=" + remedy +
                "} " + super.toString();
    }
}
