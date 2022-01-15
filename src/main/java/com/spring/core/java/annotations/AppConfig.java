package com.spring.core.java.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.core.java.annotations")
public class AppConfig {
	
	@Bean
	public Car getCar() {
		return new Car("john doe", getFiveCylinderMotor());
	}
	
	@Bean
	public FiveCylinder getFiveCylinderMotor() {
		return new FiveCylinder();
	}

}
