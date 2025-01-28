package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Rule")
public class Rule {
    @JsonldProperty("odrl:uid")
    private String uid;

    @JsonldProperty("odrl:relation")
    private Set<Asset> relation;

    @JsonldProperty("odrl:output")
    private Set<Asset> output;

    @JsonldProperty("odrl:target")
    private Asset target;

    @JsonldProperty("odrl:function")
    private Set<Party> function;

    @JsonldProperty("odrl:action")
    private Action action;

    @JsonldProperty("odrl:constraint")
    private Set<AbstractConstraint> constraint;

    @JsonldProperty("odrl:failure")
    private Set<Rule> failure;

    @JsonldProperty("odrl:assignee")
    private Party assignee;

    @JsonldProperty("odrl:assigner")
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

    public Asset getTarget() {
        return target;
    }

    public Rule setTarget(Asset target) {
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
