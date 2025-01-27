package com.github.JohannesLipp.odrljava.utils;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "skos", uri = Constants.SKOS_URI)
@JsonldType("skos:ConceptScheme")
public class ConceptScheme {
}
