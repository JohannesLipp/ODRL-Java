package com.github.JohannesLipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.JohannesLipp.odrljava.model.odrl.leftoperand.LeftOperand;
import com.github.JohannesLipp.odrljava.model.odrl.operators.Operator;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Constraint;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Agreement;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Offer;
import com.github.JohannesLipp.odrljava.model.odrl.policies.Set;
import com.github.JohannesLipp.odrljava.model.odrl.rightoperand.RightOperand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
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
    public void example01() throws IOException {
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
    public void example02() throws IOException {
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

    @Test
    public void example03() throws IOException {
        URL jsonld = getResource("example03.jsonld");
        Agreement actual = mapper.readValue(jsonld, Agreement.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/asset:9898.movie"))
                .setAssigner(URI.create("http://example.com/party:org:abc"))
                .setAssignee(URI.create("http://example.com/party:person:billie"))
                .setAction(Action.play);

        Agreement expected = new Agreement()
                .setUid("http://example.com/policy:1012")
                .setProfile(URI.create("http://example.com/odrl:profile:01"))
                .setPermission(Collections.singletonList(permission));

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void example04() throws IOException {
        URL jsonld = getResource("example04.jsonld");
        Offer actual = mapper.readValue(jsonld, Offer.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/asset:3333"))
                .setAction(Action.display)
                .setAssigner(URI.create("http://example.com/party:0001"));

        Offer expected = new Offer()
                .setUid("http://example.com/policy:3333")
                .setProfile(URI.create("http://example.com/odrl:profile:02"))
                .setPermission(Collections.singletonList(permission));

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void example05() {
        throw new UnsupportedOperationException("Only URIs are supported (no complex objects) for the \"target\" property");
    }

    @Test
    public void example06() {
        throw new UnsupportedOperationException("References from external artifacts such as Dublin Core are out of scope");
    }

    @Test
    public void example07() {
        throw new UnsupportedOperationException("References from external artifacts such as Dublin Core are out of scope");
    }

    @Test
    public void example08() throws IOException {
        URL jsonld = getResource("example08.jsonld");
        Agreement actual = mapper.readValue(jsonld, Agreement.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/music/1999.mp3"))
                .setAssigner(URI.create("http://example.com/org/sony-music"))
                .setAssignee(URI.create("http://example.com/people/billie"))
                .setAction(Action.play);

        Agreement expected = new Agreement()
                .setUid("http://example.com/policy:8888")
                .setProfile(URI.create("http://example.com/odrl:profile:04"))
                .setPermission(Collections.singletonList(permission));

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void example09() {
        throw new UnsupportedOperationException("Only URIs are supported (no complex objects) for the \"assignee\" / \"assigner\" properties");
    }

    @Test
    public void example10() {
        throw new UnsupportedOperationException("References from external artifacts such as vCard are out of scope");
    }

    @Test
    public void example11() {
        throw new UnsupportedOperationException("References from external artifacts such as vCard are out of scope");
    }

    @Test
    public void example12() throws IOException {
        URL jsonld = getResource("example12.jsonld");
        Offer actual = mapper.readValue(jsonld, Offer.class);

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/music:1012"))
                .setAssigner(URI.create("http://example.com/org:abc"))
                .setAction(Action.play);

        Offer expected = new Offer()
                .setUid("http://example.com/policy:1012")
                .setProfile(URI.create("http://example.com/odrl:profile:06"))
                .setPermission(Collections.singletonList(permission));

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void example13() throws IOException {
        URL jsonld = getResource("example13.jsonld");
        //Offer actual = mapper.readValue(jsonld, Offer.class);

        Constraint constraint = new Constraint()
                .setLeftOperand(LeftOperand.dateTime)
                .setOperator(Operator.lt)
                .setRightOperand(new RightOperand()
                        .setValue("2018-01-01")
                        .setType("xsd:date"));

        Permission permission = new Permission()
                .setTarget(URI.create("http://example.com/document:1234"))
                .setAssigner(URI.create("http://example.com/org:616"))
                .setAction(Action.distribute)
                .setConstraint(Collections.singletonList(constraint));

        Offer expected = new Offer()
                .setUid("http://example.com/policy:6163")
                .setProfile(URI.create("http://example.com/odrl:profile:10"))
                .setPermission(Collections.singletonList(permission));


        System.out.println(mapper.writeValueAsString(expected));
//        System.out.println(actual);
//        assertEquals(expected, actual);
    }
}
