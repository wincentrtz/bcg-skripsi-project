package com.binus.skripsi.bcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcgApplication.class, args);
	}

}
