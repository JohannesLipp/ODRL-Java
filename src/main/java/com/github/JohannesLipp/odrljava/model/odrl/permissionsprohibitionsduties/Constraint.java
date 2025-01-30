package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.JohannesLipp.odrljava.model.odrl.leftoperand.LeftOperand;
import com.github.JohannesLipp.odrljava.model.odrl.operators.Operator;
import com.github.JohannesLipp.odrljava.model.odrl.rightoperand.RightOperand;

import java.util.Objects;
import java.util.Set;

public class Constraint extends AbstractConstraint {
    @JsonProperty("uid")
    private String uid;

    @JsonProperty("unit")
    private Object unit;

    @JsonProperty("dataType")
    private Object dataType;

    @JsonProperty("operator")
    private Operator operator;

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

    public String getUid() {
        return uid;
    }

    public Constraint setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Object getUnit() {
        return unit;
    }

    public Constraint setUnit(Object unit) {
        this.unit = unit;
        return this;
    }

    public Object getDataType() {
        return dataType;
    }

    public Constraint setDataType(Object dataType) {
        this.dataType = dataType;
        return this;
    }

    public Operator getOperator() {
        return operator;
    }

    public Constraint setOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public RightOperand getRightOperand() {
        return rightOperand;
    }

    public Constraint setRightOperand(RightOperand rightOperand) {
        this.rightOperand = rightOperand;
        return this;
    }

    public LeftOperand getLeftOperand() {
        return leftOperand;
    }

    public Constraint setLeftOperand(LeftOperand leftOperand) {
        this.leftOperand = leftOperand;
        return this;
    }

    public Object getRightOperandReference() {
        return rightOperandReference;
    }

    public Constraint setRightOperandReference(Object rightOperandReference) {
        this.rightOperandReference = rightOperandReference;
        return this;
    }

    public Object getStatus() {
        return status;
    }

    public Constraint setStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constraint that = (Constraint) o;
        return Objects.equals(uid, that.uid) && Objects.equals(unit, that.unit) && Objects.equals(dataType, that.dataType) && Objects.equals(operator, that.operator) && Objects.equals(rightOperand, that.rightOperand) && leftOperand == that.leftOperand && Objects.equals(rightOperandReference, that.rightOperandReference) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, unit, dataType, operator, rightOperand, leftOperand, rightOperandReference, status);
    }

    @Override
    public String toString() {
        return "Constraint{" +
                ", uid='" + uid + '\'' +
                ", unit=" + unit +
                ", dataType=" + dataType +
                ", operator=" + operator +
                ", rightOperand=" + rightOperand +
                ", leftOperand=" + leftOperand +
                ", rightOperandReference=" + rightOperandReference +
                ", status=" + status +
                "} " + super.toString();
    }
}
