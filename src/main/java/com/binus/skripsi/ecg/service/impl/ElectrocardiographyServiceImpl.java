package com.binus.skripsi.ecg.service.impl;

import com.binus.skripsi.ecg.model.entity.Electrocardiography;
import com.binus.skripsi.ecg.model.entity.Patient;
import com.binus.skripsi.ecg.properties.SocketProperties;
import com.binus.skripsi.ecg.repository.ElectrocardiographyRepository;
import com.binus.skripsi.ecg.repository.PatientRepository;
import com.binus.skripsi.ecg.service.ElectrocardiographyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.socket.client.IO;
import io.socket.client.Socket;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.time.Instant;

@Service
@Slf4j
public class ElectrocardiographyServiceImpl implements ElectrocardiographyService {

    @Autowired
    ElectrocardiographyRepository electrocardiographyRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    SocketProperties socketProperties;

    @Override
    public void saveElectrocardiographyData(String stringify) throws Exception {
        Electrocardiography electrocardiography = objectMapper.readValue(stringify, Electrocardiography.class);
        electrocardiography.setAuditedInputTime(Instant.now());

        Patient patient = patientRepository.findBySensorToken(electrocardiography.getSensorToken())
                .orElseThrow(() -> new Exception("Patient with sensor token [" + electrocardiography.getSensorToken() + "] not found"));

        electrocardiographyRepository.save(electrocardiography);

        log.info("Successfully Add Data ECG: "+ electrocardiography.toString());
        Socket socket = initializeSocketIoInstance();
        socket.connect();
        socket.emit(socketProperties.getEvent(), constructEcgSocketEventValue(electrocardiography));
    }

    private Socket initializeSocketIoInstance() throws URISyntaxException {
        return IO.socket(socketProperties.getUrl());
    }

    private JSONObject constructEcgSocketEventValue(Electrocardiography electrocardiography) throws JSONException {
        JSONObject eventObject = new JSONObject();
        eventObject.put("ecgValue", electrocardiography.toString());

        return eventObject;
    }
}