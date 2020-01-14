package com.binus.skripsi.ecg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcgApplication.class, args);
	}

}
