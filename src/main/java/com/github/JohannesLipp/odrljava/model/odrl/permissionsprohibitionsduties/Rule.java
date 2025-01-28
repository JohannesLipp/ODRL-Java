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
    private Set<Asset> target;

    @JsonldProperty("odrl:function")
    private Set<Party> function;

    @JsonldProperty("odrl:action")
    private Set<Action> action;

    @JsonldProperty("odrl:constraint")
    private Set<AbstractConstraint> constraint;

    @JsonldProperty("odrl:failure")
    private Set<Rule> failure;

    @JsonldProperty("odrl:assignee")
    private Party assignee;

    @JsonldProperty("odrl:assigner")
    private Party assigner;
}
