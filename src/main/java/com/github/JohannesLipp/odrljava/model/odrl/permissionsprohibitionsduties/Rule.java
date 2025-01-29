package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;

import java.net.URI;
import java.util.Set;

public class Rule {
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
    private Set<AbstractConstraint> constraint;

    @JsonProperty("failure")
    private Set<Rule> failure;

    @JsonProperty("assignee")
    private Party assignee;

    @JsonProperty("assigner")
    private Party assigner;

    public Rule() {
    }

    public String getUid() {
        return uid;
    }

    public Rule setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Set<Asset> getRelation() {
        return relation;
    }

    public Rule setRelation(Set<Asset> relation) {
        this.relation = relation;
        return this;
    }

    public Set<Asset> getOutput() {
        return output;
    }

    public Rule setOutput(Set<Asset> output) {
        this.output = output;
        return this;
    }

    public URI getTarget() {
        return target;
    }

    public Rule setTarget(URI target) {
        this.target = target;
        return this;
    }

    public Set<Party> getFunction() {
        return function;
    }

    public Rule setFunction(Set<Party> function) {
        this.function = function;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public Rule setAction(Action action) {
        this.action = action;
        return this;
    }

    public Set<AbstractConstraint> getConstraint() {
        return constraint;
    }

    public Rule setConstraint(Set<AbstractConstraint> constraint) {
        this.constraint = constraint;
        return this;
    }

    public Set<Rule> getFailure() {
        return failure;
    }

    public Rule setFailure(Set<Rule> failure) {
        this.failure = failure;
        return this;
    }

    public Party getAssignee() {
        return assignee;
    }

    public Rule setAssignee(Party assignee) {
        this.assignee = assignee;
        return this;
    }

    public Party getAssigner() {
        return assigner;
    }

    public Rule setAssigner(Party assigner) {
        this.assigner = assigner;
        return this;
    }
}
