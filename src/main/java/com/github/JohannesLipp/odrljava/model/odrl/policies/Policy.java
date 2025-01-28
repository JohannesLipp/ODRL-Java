package com.github.JohannesLipp.odrljava.model.odrl.policies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.JohannesLipp.odrljava.model.odrl.assets.Asset;
import com.github.JohannesLipp.odrljava.model.odrl.parties.Party;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Action;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Duty;
import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.Permission;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Policy")
@JsonIgnoreProperties
public class Policy {
    @JsonldProperty("odrl:uid")
    private String uid;

    @JsonldProperty("odrl:permission")
    private Set<Permission> permission;

    @JsonldProperty("odrl:prohibition")
    private Set<Permission> prohibition;

    @JsonldProperty("odrl:inheritFrom")
    private Set<Permission> inheritFrom;

    @JsonldProperty("odrl:profile")
    private Set<Object> profile;

    @JsonldProperty("odrl:relation")
    private Set<Asset> relation;

    @JsonldProperty("odrl:target")
    private Set<Asset> target;

    @JsonldProperty("odrl:function")
    private Set<Party> function;

    @JsonldProperty("odrl:action")
    private Set<Action> action;

    @JsonldProperty("odrl:constraint")
    private Set<AbstractConstraint> constraint;

    @JsonldProperty("odrl:obligation")
    private Set<Duty> obligation;

    @JsonldProperty("odrl:assignee")
    private Party assignee;

    @JsonldProperty("odrl:assigner")
    private Party assigner;


}
