package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.leftoperand.LeftOperand;
import com.github.JohannesLipp.odrljava.model.odrl.operators.Operator;
import com.github.JohannesLipp.odrljava.model.odrl.rightoperand.RightOperand;

import java.util.Set;

public class Constraint extends AbstractConstraint {
    @JsonProperty("@type")
    private final String type = "Constraint";

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("unit")
    private Object unit;

    @JsonProperty("dataType")
    private Object dataType;

    @JsonProperty("operator")
    private Set<Operator> operator;

    @JsonProperty("rightOperand")
    private RightOperand rightOperand;

    @JsonProperty("leftOperand")
    private LeftOperand leftOperand;

    @JsonProperty("rightOperandReference")
    private Object rightOperandReference;

    @JsonProperty("status")
    private Object status;

    public Constraint() {
    }

}
