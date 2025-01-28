package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Set;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class DeserializationTests {
    static ObjectMapper mapper = new ObjectMapper();
    static ClassLoader classLoader = DeserializationTests.class.getClassLoader();

    @BeforeAll
    public static void setUp() {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.registerModule(new JsonldModule());
    }

    @Test
    public void foo() throws IOException {
        Permission permission = new Permission();
        Asset asset = new Asset();
        asset.setUid("http://example.com/asset:9898.movie");
        permission.setTarget(asset);
        permission.setAction(Action.use);

        System.out.println(mapper.writeValueAsString(permission));
    }

    @Test
    public void dummyTest() throws IOException {
        Set set = mapper.readValue(classLoader.getResource("Example01.jsonld"),Set.class);
        System.out.println(set.toString());
    }
}
