package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Permission extends Rule<Permission> {
    @JsonProperty("@type")
    private final String type = "Permission";

    @JsonProperty("duty")
    private List<Duty> duty;

    public Permission() {
    }

    public String getType() {
        return type;
    }

    public List<Duty> getDuty() {
        return duty;
    }

    public Permission setDuty(List<Duty> duty) {
        this.duty = duty;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Permission that = (Permission) o;
        return Objects.equals(type, that.type) && Objects.equals(duty, that.duty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, duty);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "type='" + type + '\'' +
                ", duty=" + duty +
                "} " + super.toString();
    }
}
