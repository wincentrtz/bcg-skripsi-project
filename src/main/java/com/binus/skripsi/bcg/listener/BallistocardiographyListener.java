package com.binus.skripsi.bcg.listener;

import com.binus.skripsi.bcg.service.BallistocardiographyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class BallistocardiographyListener {

    @Autowired
    BallistocardiographyService ballistocardiographyService;

    @Autowired
    ObjectMapper objectMapper;

    @KafkaListener(topics = "bcg")
    public void ballistocardiographyListenerFromRaspberryPi(ConsumerRecord<String, Object> record) throws JsonProcessingException {
        ballistocardiographyService.saveBallistocardiographyData(record.value().toString());
    }
}
