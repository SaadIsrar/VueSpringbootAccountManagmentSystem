package com.qa.boot.AccountManagmentApplication;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AccountManagmentApplication {
	private int accountNumber = 786;

	public static void main(String[] args) {
		SpringApplication.run(AccountManagmentApplication.class, args);
	}
}

