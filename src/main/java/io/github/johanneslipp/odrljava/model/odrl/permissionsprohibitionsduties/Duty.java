package io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;
import java.util.List;
import java.util.Objects;

public class Duty extends Rule<Duty> {
    @JsonProperty("@type")
    private final String type = "Duty";

    @JsonProperty
    private List<Duty> consequence;

    @JsonProperty
    private URI attributedParty;

    @JsonProperty
    private URI trackingParty;

    public Duty() {
    }

    @Override
    public String getType() {
        return type;
    }

    public List<Duty> getConsequence() {
        return consequence;
    }

    public Duty setConsequence(List<Duty> consequence) {
        this.consequence = consequence;
        return this;
    }

    public URI getAttributedParty() {
        return attributedParty;
    }

    public Duty setAttributedParty(URI attributedParty) {
        this.attributedParty = attributedParty;
        return this;
    }

    public URI getTrackingParty() {
        return trackingParty;
    }

    public Duty setTrackingParty(URI trackingParty) {
        this.trackingParty = trackingParty;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Duty duty = (Duty) o;
        return Objects.equals(consequence, duty.consequence) && Objects.equals(attributedParty, duty.attributedParty) && Objects.equals(trackingParty, duty.trackingParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, consequence, attributedParty, trackingParty);
    }

    @Override
    public String toString() {
        return "Duty{" +
                "type='" + type + '\'' +
                ", consequence=" + consequence +
                ", attributedParty=" + attributedParty +
                ", trackingParty=" + trackingParty +
                "} " + super.toString();
    }
}
