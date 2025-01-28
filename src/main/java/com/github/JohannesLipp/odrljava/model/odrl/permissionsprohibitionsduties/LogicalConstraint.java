package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.List;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:LogicalConstraint")
public class LogicalConstraint extends AbstractConstraint {
    @JsonldProperty("odrl:uid")
    private String uid;

    @JsonldProperty("odrl:operand")
    private List<Constraint> operand;

    @JsonldProperty("odrl:andSequence")
    private List<Constraint> andSequence;

    @JsonldProperty("odrl:or")
    private List<Constraint> or;

    @JsonldProperty("odrl:and")
    private List<Constraint> and;

    @JsonldProperty("odrl:xone")
    private List<Constraint> xone;
}
