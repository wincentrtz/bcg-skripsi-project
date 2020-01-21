package com.binus.skripsi.ecg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "electrocardiography")
public class Electrocardiography {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernateSequence")
    @SequenceGenerator(name = "hibernateSequence")
    private Long id;

    @Column(name = "reference_id")
    private Long referenceId;

    @NotNull
    @Column(name = "jhi_value", nullable = false)
    private Double value;

    @NotNull
    @Column(name = "input_time", nullable = false)
    private Instant inputTime;

    @Column(name = "audited_input_time")
    private Instant auditedInputTime;

    @Column(name = "sensor_token")
    private String sensorToken;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public Electrocardiography referenceId(Long referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    public Double getValue() {
        return value;
    }

    public Electrocardiography value(Double value) {
        this.value = value;
        return this;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Instant getInputTime() {
        return inputTime;
    }

    public Electrocardiography inputTime(Instant inputTime) {
        this.inputTime = inputTime;
        return this;
    }

    public void setInputTime(Instant inputTime) {
        this.inputTime = inputTime;
    }

    public Instant getAuditedInputTime() {
        return auditedInputTime;
    }

    public Electrocardiography auditedInputTime(Instant auditedInputTime) {
        this.auditedInputTime = auditedInputTime;
        return this;
    }

    public void setAuditedInputTime(Instant auditedInputTime) {
        this.auditedInputTime = auditedInputTime;
    }

    public String getSensorToken() {
        return sensorToken;
    }

    public Electrocardiography sensorToken(String sensorToken) {
        this.sensorToken = sensorToken;
        return this;
    }

    public void setSensorToken(String sensorToken) {
        this.sensorToken = sensorToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Electrocardiography ecg = (Electrocardiography) o;
        if (ecg.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), ecg.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Ecg{" +
                "id=" + getId() +
                ", referenceId=" + getReferenceId() +
                ", value=" + getValue() +
                ", inputTime='" + getInputTime() + "'" +
                ", auditedInputTime='" + getAuditedInputTime() + "'" +
                ", sensorToken='" + getSensorToken() + "'" +
                "}";
    }
}
