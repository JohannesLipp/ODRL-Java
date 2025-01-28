package com.github.JohannesLipp.odrljava.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = RightOperandWrapperDeserializer.class)
public class RightOperandWrapper {
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "@type"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = TypedValue.class, name = "TypedValue"),
            @JsonSubTypes.Type(value = RightOperandId.class, name = "RightOperandId")
    })
    private Object value;

    public RightOperandWrapper(Object value) {
        if (!(value instanceof TypedValue || value instanceof RightOperandId)) {
            throw new IllegalArgumentException("Invalid type for RightOperandWrapper");
        }
        this.value = value;
    }

    @JsonValue
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        if (!(value instanceof TypedValue || value instanceof RightOperandId)) {
            throw new IllegalArgumentException("Invalid type for RightOperandWrapper");
        }
        this.value = value;
    }
}