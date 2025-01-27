package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.github.JohannesLipp.odrljava.model.LeftOperand;
import com.github.JohannesLipp.odrljava.model.Operator;
import com.github.JohannesLipp.odrljava.model.RightOperandWrapper;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Constraint")
public class Constraint extends AbstractConstraint {
    @JsonldProperty("odrl:uid")
    private String uid;

    @JsonldProperty("odrl:unit")
    private Object unit;

    @JsonldProperty("odrl:dataType")
    private Object dataType;

    @JsonldProperty("odrl:operator")
    private Set<Operator> operator;

    @JsonldProperty("odrl:rightOperand")
    private RightOperandWrapper rightOperand;

    @JsonldProperty("odrl:leftOperand")
    private LeftOperand leftOperand;

    @JsonldProperty("odrl:rightOperandReference")
    private Object rightOperandReference;

    @JsonldProperty("odrl:status")
    private Object status;
}
