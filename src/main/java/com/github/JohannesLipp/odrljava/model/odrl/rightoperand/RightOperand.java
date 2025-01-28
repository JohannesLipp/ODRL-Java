package com.github.JohannesLipp.odrljava.model.odrl.rightoperand;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:RightOperand")
public class RightOperand {
    @JsonProperty("@value")
    private String value;

    @JsonProperty("@type")
    private String type;

    public RightOperand() {
    }
}
