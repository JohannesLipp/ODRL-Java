package com.github.JohannesLipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.OdrlClass;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Duty;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;

import java.util.List;
import java.util.Set;

public class Policy extends OdrlClass {
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
    private Set<Object> profile;

    @JsonProperty("relation")
    private Set<Asset> relation;

    @JsonProperty("target")
    private Set<Asset> target;

    @JsonProperty("function")
    private Set<Party> function;

    @JsonProperty("action")
    private Set<Action> action;

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

    public List<Permission> getPermission() {
        return permission;
    }

    public Policy setPermission(List<Permission> permission) {
        this.permission = permission;
        return this;
    }
}
