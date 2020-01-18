package com.binus.skripsi.ecg.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "app.skripsi.ecg.socket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocketProperties {

    private String url;
    private String event;
}
