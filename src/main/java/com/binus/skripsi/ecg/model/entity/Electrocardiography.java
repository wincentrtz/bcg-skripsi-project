package com.binus.skripsi.ecg.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

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

    @Column(name = "reference_id", nullable = false)
    private Long referenceId;

    @Column(name = "jhi_value", nullable = false)
    private Double value;

    @Column(name = "input_time", nullable = false)
    private Instant inputTime;

    @Column(name = "audited_input_time", nullable = false)
    private Instant auditedInputTime;

    @Column(name = "sensor_token", nullable = false)
    private String sensorToken;
}
