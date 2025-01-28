package com.github.JohannesLipp.odrljava.model;

import com.github.JohannesLipp.odrljava.utils.Constants;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "odrl", uri = Constants.ODRL_URI)
@JsonldType("odrl:LeftOperand")
public enum LeftOperand {
    absolutePosition,
    absoluteSpatialPosition,
    absoluteTemporalPosition,
    absoluteSize,
    count,
    dateTime,
    delayPeriod,
    deliveryChannel,
    elapsedTime,
    event,
    fileFormat,
    industry,
    language,
    media,
    meteredTime,
    payAmount,
    percentage,
    product,
    purpose,
    recipient,
    relativePosition,
    relativeSpatialPosition,
    relativeTemporalPosition,
    relativeSize,
    resolution,
    spatial,
    spatialCoordinates,
    systemDevice ,
    timeInterval,
    unitOfCount,
    version,
    virtualLocation
}
