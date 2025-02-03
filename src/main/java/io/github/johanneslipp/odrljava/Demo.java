package io.github.johanneslipp.odrljava;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.github.johanneslipp.odrljava.model.odrl.leftoperand.LeftOperand;
import io.github.johanneslipp.odrljava.model.odrl.operators.Operator;
import io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties.Constraint;
import io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;
import io.github.johanneslipp.odrljava.model.odrl.policies.Offer;
import io.github.johanneslipp.odrljava.model.odrl.rightoperand.RightOperand;

import java.net.URI;
import java.util.Collections;

public class Demo {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        serializeExample();
        deSerializeExample();
    }

    private static void serializeExample() throws JsonProcessingException {
        // Create ODRL-Java instance, e.g. via setter builder pattern
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

        Offer offer = new Offer()
                .setUid("http://example.com/policy:6163")
                .setProfile(URI.create("http://example.com/odrl:profile:10"))
                .setPermission(Collections.singletonList(permission));

        // Serialize ODRL-Java to JSON-LD
        System.out.println(mapper.writeValueAsString(offer));
    }

    private static void deSerializeExample() throws JsonProcessingException {
        // Create JSON-LD content (can also be read from file, e.g. via `mapper.readValue(URI uri, Offer.class)`
        String example04 = """
                {
                   "@context": "http://www.w3.org/ns/odrl.jsonld",
                   "@type": "Offer",
                   "uid": "http://example.com/policy:3333",
                   "profile": "http://example.com/odrl:profile:02",
                   "permission": [{
                       "target": "http://example.com/asset:3333",
                       "action": "display",
                       "assigner": "http://example.com/party:0001"
                   }]
                }""";

        // Deserialize JSON-LD to ODRL-Java
        Offer offer = mapper.readValue(example04, Offer.class);

        // Use ODRL-Java, e.g. read fields via Getters
        System.out.println("Profile: " + offer.getProfile());
        System.out.println("Action: " + offer.getPermission().getFirst().getAction().getFirst());
    }
}
