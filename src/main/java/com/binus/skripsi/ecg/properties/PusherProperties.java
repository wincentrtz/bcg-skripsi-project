package com.binus.skripsi.ecg.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.skripsi.ecg.pusher")
@Data
public class PusherProperties {

    private String id;
    private String key;
    private String secret;
    private String channel;
    private String event;
}
