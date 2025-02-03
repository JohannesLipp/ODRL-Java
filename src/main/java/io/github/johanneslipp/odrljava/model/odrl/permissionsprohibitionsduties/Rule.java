package io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.johanneslipp.odrljava.model.odrl.assets.Asset;
import io.github.johanneslipp.odrljava.model.odrl.parties.Party;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Rule<T extends Rule<T>> {
    @JsonProperty("@type")
    private final String type = "Rule";

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("relation")
    private Set<Asset> relation;

    @JsonProperty("output")
    private Set<Asset> output;

    @JsonProperty("target")
    @JsonSerialize(using = SingleOrArrayUriSerializer.class)
    @JsonDeserialize(using = SingleOrArrayUriDeserializer.class)
    private List<URI> target;

    @JsonProperty("function")
    private Set<Party> function;

    @JsonProperty("action")
    @JsonSerialize(using = SingleOrArrayActionSerializer.class)
    @JsonDeserialize(using = SingleOrArrayActionDeserializer.class)
    private List<Action> action;

    @JsonProperty("constraint")
    private List<AbstractConstraint> constraint;

    @JsonProperty("failure")
    private Set<Rule<?>> failure;

    @JsonProperty("assignee")
    private URI assignee;

    @JsonProperty("assigner")
    private URI assigner;

    public Rule() {
    }

    public String getType() {
        return type;
    }

    public String getUid() {
        return uid;
    }

    @SuppressWarnings("unchecked")
    public T setUid(String uid) {
        this.uid = uid;
        return (T) this;
    }

    public Set<Asset> getRelation() {
        return relation;
    }

    @SuppressWarnings("unchecked")
    public T setRelation(Set<Asset> relation) {
        this.relation = relation;
        return (T) this;
    }

    public Set<Asset> getOutput() {
        return output;
    }

    @SuppressWarnings("unchecked")
    public T setOutput(Set<Asset> output) {
        this.output = output;
        return (T) this;
    }

    public List<URI> getTarget() {
        return target;
    }

    @SuppressWarnings("unchecked")
    public T setTarget(URI target) {
        this.target = Collections.singletonList(target);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @JsonSetter
    public T setTarget(List<URI> target) {
        this.target = target;
        return (T) this;
    }

    public Set<Party> getFunction() {
        return function;
    }

    @SuppressWarnings("unchecked")
    public T setFunction(Set<Party> function) {
        this.function = function;
        return (T) this;
    }

    public List<Action> getAction() {
        return action;
    }

    @SuppressWarnings("unchecked")
    public T setAction(List<Action> action) {
        this.action = action;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public T setAction(Action action) {
        this.action = Collections.singletonList(action);
        return (T) this;
    }

    public List<AbstractConstraint> getConstraint() {
        return constraint;
    }

    @SuppressWarnings("unchecked")
    public T setConstraint(List<AbstractConstraint> constraint) {
        this.constraint = constraint;
        return (T) this;
    }

    public Set<Rule<?>> getFailure() {
        return failure;
    }

    @SuppressWarnings("unchecked")
    public T setFailure(Set<Rule<?>> failure) {
        this.failure = failure;
        return (T) this;
    }

    public URI getAssignee() {
        return assignee;
    }

    @SuppressWarnings("unchecked")
    public T setAssignee(URI assignee) {
        this.assignee = assignee;
        return (T) this;
    }

    public URI getAssigner() {
        return assigner;
    }

    @SuppressWarnings("unchecked")
    public T setAssigner(URI assigner) {
        this.assigner = assigner;
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule<?> rule = (Rule<?>) o;
        return Objects.equals(uid, rule.uid) && Objects.equals(relation, rule.relation) && Objects.equals(output, rule.output) && Objects.equals(target, rule.target) && Objects.equals(function, rule.function) && Objects.equals(action, rule.action) && Objects.equals(constraint, rule.constraint) && Objects.equals(failure, rule.failure) && Objects.equals(assignee, rule.assignee) && Objects.equals(assigner, rule.assigner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, uid, relation, output, target, function, action, constraint, failure, assignee, assigner);
    }

    @Override
    public String toString() {
        return "Rule{" +
                "type='" + type + '\'' +
                ", uid='" + uid + '\'' +
                ", relation=" + relation +
                ", output=" + output +
                ", target=" + target +
                ", function=" + function +
                ", action=" + action +
                ", constraint=" + constraint +
                ", failure=" + failure +
                ", assignee=" + assignee +
                ", assigner=" + assigner +
                '}';
    }

    public static class SingleOrArrayUriSerializer extends JsonSerializer<List<URI>> {
        @Override
        public void serialize(List<URI> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (list.size() > 1) {
                jsonGenerator.writeStartArray();
                for (URI uri : list) {
                    jsonGenerator.writeString(uri.toString());
                }
                jsonGenerator.writeEndArray();
            } else if (list.size() == 1) {
                jsonGenerator.writeString(list.getFirst().toString());
            }
            // Write nothing if list is empty
        }
    }

    public static class SingleOrArrayUriDeserializer extends JsonDeserializer<List<URI>> {
        @Override
        public List<URI> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return jsonParser.readValueAs(new TypeReference<List<URI>>() {
                });
            } else {
                return Collections.singletonList(URI.create(jsonParser.getValueAsString()));
            }
        }
    }

    private static class SingleOrArrayActionSerializer extends JsonSerializer<List<Action>> {

        public SingleOrArrayActionSerializer() {
        }

        @Override
        public void serialize(List<Action> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (list.size() > 1) {
                jsonGenerator.writeStartArray();
                for (Action action : list) {
                    jsonGenerator.writeString(action.toString());
                }
                jsonGenerator.writeEndArray();
            } else if (list.size() == 1) {
                jsonGenerator.writeString(list.getFirst().toString());
            }
            // Write nothing if list is empty
        }
    }

    private static class SingleOrArrayActionDeserializer extends JsonDeserializer<List<Action>> {
        public SingleOrArrayActionDeserializer() {
        }

        @Override
        public List<Action> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return jsonParser.readValueAs(new TypeReference<List<Action>>() {
                });
            } else {
                return Collections.singletonList(jsonParser.readValueAs(Action.class));
            }
        }
    }
}
