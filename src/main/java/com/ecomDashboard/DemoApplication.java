package com.ecomDashboard;

import com.ecomDashboard.controller.endpointRESTAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = "com.ecomDashboard.repositories")
@EntityScan(basePackages = "com.ecomDashboard.entity")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
