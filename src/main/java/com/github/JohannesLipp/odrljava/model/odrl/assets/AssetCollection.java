package com.github.JohannesLipp.odrljava.model.odrl.assets;

import com.github.JohannesLipp.odrljava.model.odrl.permissionsprohibitionsduties.AbstractConstraint;
import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.Set;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:AssetCollection")
public class AssetCollection extends Asset {
    @JsonldProperty("odrl:source")
    private AssetCollection source;

    @JsonldProperty("odrl:refinement")
    private Set<AbstractConstraint> refinement;
}
