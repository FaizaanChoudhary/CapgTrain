package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class MultiplexBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexBookingSystemApplication.class, args);
		System.out.println("Hello");
	}

}
