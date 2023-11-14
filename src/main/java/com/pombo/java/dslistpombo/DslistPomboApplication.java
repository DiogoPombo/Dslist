package com.pombo.java.dslistpombo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DslistPomboApplication {

	public static void main(String[] args) {
		SpringApplication.run(DslistPomboApplication.class, args);
		
		String MADE_BY = "Pombo";
		String AVATAR = "\\Õ/";
		System.out.println("Made by:" + " " + MADE_BY + " " + AVATAR);
	}

}
