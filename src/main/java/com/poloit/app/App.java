package com.poloit.app;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.polit.WebController"})

@SpringBootApplication
public class App {

	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(App.class, args);
	}

}
