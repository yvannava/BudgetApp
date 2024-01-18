package com.yvan.budget_app_v2_backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BudgetAppV2BackendApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		// Access individual variables
		String dbUsername = dotenv.get("DB_USER");
		String dbPassword = dotenv.get("DB_PASSWORD");
		String dbDatabase = dotenv.get("DB_DATABASE");
		String dbURL = dotenv.get("DB_URL");
		System.setProperty("spring.datasource.url", "jdbc:mysql://"+ dbURL + "/" + dbDatabase);
		System.setProperty("spring.datasource.username", dbUsername);
		System.setProperty("spring.datasource.password", dbPassword);
		SpringApplication.run(BudgetAppV2BackendApplication.class, args);
	}



}
