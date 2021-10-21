package io.m9rcy.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaAvroTwoApplication implements CommandLineRunner {

	@Autowired
	BusinessDomainService businessDomainService;

	public static void main(String[] args) {
		SpringApplication.run(KafkaAvroTwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		businessDomainService.generateAndSendMessage();
	}
}
