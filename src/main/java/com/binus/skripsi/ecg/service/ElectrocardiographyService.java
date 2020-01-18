package com.binus.skripsi.ecg.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;

import java.net.URISyntaxException;

public interface ElectrocardiographyService {

    void saveElectrocardiographyData(String stringify) throws JsonProcessingException, URISyntaxException, JSONException;
}
