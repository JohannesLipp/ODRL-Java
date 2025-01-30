package com.github.JohannesLipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.OdrlClass;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Duty;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Policy<T extends Policy<T>> extends OdrlClass {
    @JsonProperty("@type")
    private final String type = "Policy";

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("permission")
    private List<Permission> permission;

    @JsonProperty("prohibition")
    private Set<Permission> prohibition;

    @JsonProperty("inheritFrom")
    private Set<Permission> inheritFrom;

    @JsonProperty("profile")
    private URI profile;

    @JsonProperty("relation")
    private Set<Asset> relation;

    @JsonProperty("target")
    private Set<Asset> target;

    @JsonProperty("function")
    private Set<Party> function;

    @JsonProperty("action")
    private Action action;

    @JsonProperty("constraint")
    private Set<AbstractConstraint> constraint;

    @JsonProperty("obligation")
    private Set<Duty> obligation;

    @JsonProperty("assignee")
    private Party assignee;

    @JsonProperty("assigner")
    private Party assigner;

    public Policy() {
    }

    public String getType() {
        return type;
    }

    public String getUid() {
        return uid;
    }

    public T setUid(String uid) {
        this.uid = uid;
        return (T) this;
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public T setPermission(List<Permission> permission) {
        this.permission = permission;
        return (T) this;
    }

    public Set<Permission> getProhibition() {
        return prohibition;
    }

    public T setProhibition(Set<Permission> prohibition) {
        this.prohibition = prohibition;
        return (T) this;
    }

    public Set<Permission> getInheritFrom() {
        return inheritFrom;
    }

    public T setInheritFrom(Set<Permission> inheritFrom) {
        this.inheritFrom = inheritFrom;
        return (T) this;
    }

    public URI getProfile() {
        return profile;
    }

    public T setProfile(URI profile) {
        this.profile = profile;
        return (T) this;
    }

    public Set<Asset> getRelation() {
        return relation;
    }

    public T setRelation(Set<Asset> relation) {
        this.relation = relation;
        return (T) this;
    }

    public Set<Asset> getTarget() {
        return target;
    }

    public T setTarget(Set<Asset> target) {
        this.target = target;
        return (T) this;
    }

    public Set<Party> getFunction() {
        return function;
    }

    public T setFunction(Set<Party> function) {
        this.function = function;
        return (T) this;
    }

    public Action getAction() {
        return action;
    }

    public T setAction(Action action) {
        this.action = action;
        return (T) this;
    }

    public Set<AbstractConstraint> getConstraint() {
        return constraint;
    }

    public T setConstraint(Set<AbstractConstraint> constraint) {
        this.constraint = constraint;
        return (T) this;
    }

    public Set<Duty> getObligation() {
        return obligation;
    }

    public T setObligation(Set<Duty> obligation) {
        this.obligation = obligation;
        return (T) this;
    }

    public Party getAssignee() {
        return assignee;
    }

    public T setAssignee(Party assignee) {
        this.assignee = assignee;
        return (T) this;
    }

    public Party getAssigner() {
        return assigner;
    }

    public T setAssigner(Party assigner) {
        this.assigner = assigner;
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(type, policy.type) && Objects.equals(uid, policy.uid) && Objects.equals(permission, policy.permission) && Objects.equals(prohibition, policy.prohibition) && Objects.equals(inheritFrom, policy.inheritFrom) && Objects.equals(profile, policy.profile) && Objects.equals(relation, policy.relation) && Objects.equals(target, policy.target) && Objects.equals(function, policy.function) && Objects.equals(action, policy.action) && Objects.equals(constraint, policy.constraint) && Objects.equals(obligation, policy.obligation) && Objects.equals(assignee, policy.assignee) && Objects.equals(assigner, policy.assigner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, uid, permission, prohibition, inheritFrom, profile, relation, target, function, action, constraint, obligation, assignee, assigner);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "type='" + type + '\'' +
                ", uid='" + uid + '\'' +
                ", permission=" + permission +
                ", prohibition=" + prohibition +
                ", inheritFrom=" + inheritFrom +
                ", profile=" + profile +
                ", relation=" + relation +
                ", target=" + target +
                ", function=" + function +
                ", action=" + action +
                ", constraint=" + constraint +
                ", obligation=" + obligation +
                ", assignee=" + assignee +
                ", assigner=" + assigner +
                "} " + super.toString();
    }
}
