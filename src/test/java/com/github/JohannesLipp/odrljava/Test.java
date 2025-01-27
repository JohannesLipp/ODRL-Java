package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.JohannesLipp.odrljava.model.RightOperand;
import com.github.JohannesLipp.odrljava.model.RightOperandWrapper;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;

import java.net.URI;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JsonldModule());


//        RightOperandWrapper wrapper1 = new RightOperandWrapper(new RightOperand());
//        RightOperandWrapper wrapper2 = new RightOperandWrapper("some literal value");
//        RightOperandWrapper wrapper3 = new RightOperandWrapper(URI.create("http://example.com"));
//
//        System.out.println(objectMapper.writeValueAsString(wrapper1));
//        System.out.println(objectMapper.writeValueAsString(wrapper2));
//        System.out.println(objectMapper.writeValueAsString(wrapper3));
    }
}
