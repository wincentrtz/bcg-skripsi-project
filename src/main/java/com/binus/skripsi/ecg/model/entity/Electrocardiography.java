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

    @Column(name = "reference_id")
    private Long referenceId;

    @NonNull
    @Column(name = "jhi_value")
    private Double value;

    @NonNull
    @Column(name = "input_time")
    private Instant inputTime;

    @NonNull
    @Column(name = "audited_input_time")
    private Instant auditedInputTime;

    @NonNull
    @Column(name = "sensor_token")
    private String sensorToken;
}
