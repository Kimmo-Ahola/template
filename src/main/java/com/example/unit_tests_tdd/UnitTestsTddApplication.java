package com.example.unit_tests_tdd;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class UnitTestsTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestsTddApplication.class, args);
	}

	@Bean(initMethod = "migrate")
	public Flyway flyway(DataSource dataSource) {
		return Flyway.configure()
				.dataSource(dataSource)
				.locations("classpath:db/migration")
				.load();
	}
}
