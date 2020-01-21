package com.binus.skripsi.ecg.listener;

import com.binus.skripsi.ecg.service.ElectrocardiographyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@Slf4j
public class ElectrocardiographyListener {

    @Autowired
    ElectrocardiographyService electrocardiographyService;

    @Autowired
    ObjectMapper objectMapper;

    @KafkaListener(topics = "ecg")
    public void electrocardiographyListener(ConsumerRecord<String, Object> record) throws Exception {
        electrocardiographyService.saveElectrocardiographyData(record.value().toString());
    }
}
