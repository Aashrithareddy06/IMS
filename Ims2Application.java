package com.klu.ims2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Ims2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ims2Application.class, args);
		System.out.print("IMS-Version02");
	}

}
