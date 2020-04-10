package com.empredetec.smartchoice.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.empredetec.smartchoice.beans.entities"})
public class SmartchoiceServiceStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartchoiceServiceStudentsApplication.class, args);
	}

}
