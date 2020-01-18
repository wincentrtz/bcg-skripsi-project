package com.binus.skripsi.ecg;

import com.binus.skripsi.ecg.properties.SocketProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties(SocketProperties.class)
public class EcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcgApplication.class, args);
	}

}
