package com.github.JohannesLipp.odrljava.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.net.URI;

public class RightOperandWrapper {
    private Object value;

    public RightOperandWrapper(Object value) {
        if (!(value instanceof RightOperand || value instanceof String || value instanceof URI)) {
            throw new IllegalArgumentException("Invalid type for RightOperandWrapper");
        }
        this.value = value;
    }

    @JsonValue
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        if (!(value instanceof RightOperand || value instanceof String || value instanceof URI)) {
            throw new IllegalArgumentException("Invalid type for RightOperandWrapper");
        }
        this.value = value;
    }
}
