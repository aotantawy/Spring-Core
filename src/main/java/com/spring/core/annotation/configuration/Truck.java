package com.spring.core.annotation.configuration;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

	public void drive() {
		System.out.println("I'm driving truck");
	}

}
