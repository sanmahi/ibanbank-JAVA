package com.iban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IbanBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbanBankApplication.class, args);
		
		
				String s1="adA12", s2="jh@l-'";
				System.out.println(s1.matches("[a-zA-Z0-9'-]+"));
				System.out.println(s2.matches("[a-zA-Z0-9]+"));
			
		}
	}
