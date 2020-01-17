package com.binus.skripsi.ecg.service.impl;

import com.binus.skripsi.ecg.model.entity.Electrocardiography;
import com.binus.skripsi.ecg.repository.ElectrocardiographyRepository;
import com.binus.skripsi.ecg.service.ElectrocardiographyService;
import com.binus.skripsi.ecg.util.EventPublisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ElectrocardiographyServiceImpl implements ElectrocardiographyService {

    @Autowired
    ElectrocardiographyRepository electrocardiographyRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    EventPublisher eventPublisher;

    @Override
    public void saveElectrocardiographyData(String stringify) throws JsonProcessingException {
        Electrocardiography electrocardiography = objectMapper.readValue(stringify, Electrocardiography.class);
        electrocardiographyRepository.save(electrocardiography);
        log.info("Successfully Add Data ECG: "+ electrocardiography.getEcgValue());
        eventPublisher.publish(electrocardiography, "web-socket");
    }
}