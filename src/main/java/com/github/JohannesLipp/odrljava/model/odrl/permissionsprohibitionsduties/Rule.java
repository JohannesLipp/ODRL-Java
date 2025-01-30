package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;

import java.net.URI;
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
    private URI target;

    @JsonProperty("function")
    private Set<Party> function;

    @JsonProperty("action")
    private Action action;

    @JsonProperty("constraint")
    private List<AbstractConstraint> constraint;

    @JsonProperty("failure")
    private Set<Rule> failure;

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

    public URI getTarget() {
        return target;
    }

    @SuppressWarnings("unchecked")
    public T setTarget(URI target) {
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

    public Action getAction() {
        return action;
    }

    @SuppressWarnings("unchecked")
    public T setAction(Action action) {
        this.action = action;
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

    public Set<Rule> getFailure() {
        return failure;
    }

    @SuppressWarnings("unchecked")
    public T setFailure(Set<Rule> failure) {
        this.failure = failure;
        return (T) this;
    }

    public URI getAssignee() {
        return assignee;
    }

    public T setAssignee(URI assignee) {
        this.assignee = assignee;
        return (T) this;
    }

    public URI getAssigner() {
        return assigner;
    }

    public T setAssigner(URI assigner) {
        this.assigner = assigner;
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule<?> rule = (Rule<?>) o;
        return Objects.equals(type, rule.type) && Objects.equals(uid, rule.uid) && Objects.equals(relation, rule.relation) && Objects.equals(output, rule.output) && Objects.equals(target, rule.target) && Objects.equals(function, rule.function) && action == rule.action && Objects.equals(constraint, rule.constraint) && Objects.equals(failure, rule.failure) && Objects.equals(assignee, rule.assignee) && Objects.equals(assigner, rule.assigner);
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
}
