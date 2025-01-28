package com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Constraint.class, name = "Constraint"),
        @JsonSubTypes.Type(value = LogicalConstraint.class, name = "LogicalConstraint")
})
public abstract class AbstractConstraint {
    public AbstractConstraint() {
    }
}