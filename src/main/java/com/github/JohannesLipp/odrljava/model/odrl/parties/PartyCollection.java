package com.github.JohannesLipp.odrljava.model.odrl.parties;

import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:PartyCollection")
public class PartyCollection extends Party {
    @JsonldProperty("odrl:source")
    private PartyCollection source;

    @JsonldProperty("odrl:refinement")
    private Set<AbstractConstraint> refinement;
}
