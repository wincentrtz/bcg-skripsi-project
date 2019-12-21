package com.binus.skripsi.bcg.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface BallistocardiographyService {

    void saveBallistocardiographyData(String stringify) throws JsonProcessingException;
}
