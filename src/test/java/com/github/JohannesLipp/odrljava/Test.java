package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.JohannesLipp.odrljava.model.Duty;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JsonldModule());

        Duty duty = new Duty();
        String out = objectMapper.writeValueAsString(duty);
        System.out.println(out);
    }
}
