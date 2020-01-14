package com.binus.skripsi.ecg.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ElectrocardiographyService {

    void saveElectrocardiographyData(String stringify) throws JsonProcessingException;
}
