package com.binus.skripsi.ecg.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "spring.kafka.consumer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaProperties {
    private String bootstrapServers;
    private String groupId;
}
