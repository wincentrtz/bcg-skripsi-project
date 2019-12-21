package com.binus.skripsi.bcg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ballistocardiography")
public class Ballistocardiography {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name ="request_id")
    private String requestId;

    @Column(name ="heart_rate")
    private Integer heartRate;

    @Column(name ="repositoryRate")
    private Integer respitoryRate;

    @Column(name ="stroke_volume")
    private Integer strokeVolume;

    @Column(name ="heart_rate_variability")
    private Integer heartRateVariability;

    @Column(name ="signal_strength")
    private Integer signalStrength;

    @Column(name ="status")
    private Integer status;

    @Column(name ="b2b")
    private Integer b2b;

    @Column(name ="b2bb")
    private Integer b2bb;

    @Column(name ="b2bbb")
    private Integer b2bbb;
}
