package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize()
public class LogicalConstraint extends AbstractConstraint {
    @JsonProperty("@type")
    private final String type = "LogicalConstraint";

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("operand")
    private List<Constraint> operand;

    @JsonProperty("andSequence")
    private List<Constraint> andSequence;

    @JsonProperty("or")
    private List<Constraint> or;

    @JsonProperty("and")
    private List<Constraint> and;

    @JsonProperty("xone")
    private List<Constraint> xone;

    public LogicalConstraint() {
    }
}
