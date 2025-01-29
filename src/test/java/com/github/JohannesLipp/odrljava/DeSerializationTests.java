package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Offer;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Set;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeSerializationTests {
    static ObjectMapper mapper = new ObjectMapper();

    private static URL getResource(String name) {
        return DeSerializationTests.class.getClassLoader().getResource("odrl-examples/" + name);
    }

    @BeforeAll
    public static void setUp() {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void example01() throws IOException, URISyntaxException {
        URL jsonld = getResource("example01.jsonld");
        Set actual = mapper.readValue(jsonld, Set.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/asset:9898.movie"))
                .setAction(Action.use);

        Set expected = new Set()
                .setPermission(Collections.singletonList(permission))
                .setUid("http://example.com/policy:1010");

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void example02() throws IOException, URISyntaxException {
        URL jsonld = getResource("example02.jsonld");
        Offer actual = mapper.readValue(jsonld, Offer.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/asset:9898.movie"))
                .setAssigner(URI.create("http://example.com/party:org:abc"))
                .setAction(Action.play);

        Offer expected = new Offer()
                .setUid("http://example.com/policy:1011")
                .setProfile(URI.create("http://example.com/odrl:profile:01"))
                .setPermission(Collections.singletonList(permission));

        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
