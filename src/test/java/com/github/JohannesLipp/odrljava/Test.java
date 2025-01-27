package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Policy;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JsonldModule());


//        Policy policy = new Policy();
//        policy.setUid();
//
//        String out = objectMapper.writeValueAsString(uid);
//        System.out.println(out);
    }
}
