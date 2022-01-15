package com.spring.core.java.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Vehicle car = context.getBean(Car.class);
		System.out.println(car);
		
		Vehicle truck = context.getBean(Truck.class);
		System.out.println(truck);

	}

}
