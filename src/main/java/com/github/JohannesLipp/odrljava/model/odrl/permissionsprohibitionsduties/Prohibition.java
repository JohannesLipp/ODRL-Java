package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Prohibition")
public class Prohibition extends Rule {
    @JsonldProperty("odrl:remedy")
    private Set<Duty> remedy;
}
