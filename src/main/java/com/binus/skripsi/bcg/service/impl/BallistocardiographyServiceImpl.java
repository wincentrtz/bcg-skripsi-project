package com.binus.skripsi.bcg.service.impl;

import com.binus.skripsi.bcg.model.entity.Ballistocardiography;
import com.binus.skripsi.bcg.repository.BallistocardiographyRepository;
import com.binus.skripsi.bcg.service.BallistocardiographyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BallistocardiographyServiceImpl implements BallistocardiographyService {

    @Autowired
    BallistocardiographyRepository ballistocardiographyRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void saveBallistocardiographyData(String stringify) throws JsonProcessingException {
        Ballistocardiography ballistocardiography = objectMapper.readValue(stringify, Ballistocardiography.class);
        ballistocardiographyRepository.save(ballistocardiography);
        log.info("Successfully Add Data BCG: "+ ballistocardiography.getRequestId());
    }
}