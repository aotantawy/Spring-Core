package com.spring.core.xml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-xml.xml");

		Vehicle vehicle = context.getBean("car", Vehicle.class);
		vehicle.drive();
		System.out.println(vehicle);
	}

}
