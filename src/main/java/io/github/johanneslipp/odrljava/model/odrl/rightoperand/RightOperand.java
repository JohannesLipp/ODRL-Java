package io.github.johanneslipp.odrljava.model.odrl.rightoperand;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class RightOperand {
    @JsonProperty("@type")
    private String type;

    @JsonProperty("@value")
    private String value;

    public RightOperand() {
    }

    public String getType() {
        return type;
    }

    public RightOperand setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public RightOperand setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightOperand that = (RightOperand) o;
        return Objects.equals(type, that.type) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return "RightOperand{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
