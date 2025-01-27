package com.github.JohannesLipp.odrljava.model.cc;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "cc", uri = Constants.CC_URI)
@JsonldType("cc:DerivativeWorks")
public class DerivativeWorks {
}
