package com.github.JohannesLipp.odrljava.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class RightOperandWrapperDeserializer extends JsonDeserializer<RightOperandWrapper> {
    @Override
    public RightOperandWrapper deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);

        if (node.has("@value") && node.has("@type")) {
            String value = node.get("@value").asText();
            String type = node.get("@type").asText();
            return new RightOperandWrapper(new TypedValue(value, type));
        } else if (node.has("@id")) {
            String id = node.get("@id").asText();
            return new RightOperandWrapper(new RightOperandId(id));
        } else {
            throw new IllegalArgumentException("Invalid JSON structure for RightOperandWrapper");
        }
    }
}
