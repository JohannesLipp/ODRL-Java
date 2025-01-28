package com.github.JohannesLipp.odrljava.model.odrl.operators;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:Operator")
public enum Operator {
    eq,
    gt,
    gteq,
    hasPart,
    isA,
    isAllOf,
    isAnyOf,
    isNoneOf,
    isPartOf,
    lt,
    lteq,
    neq
}
