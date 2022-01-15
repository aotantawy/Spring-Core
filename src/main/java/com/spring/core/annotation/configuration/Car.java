package com.spring.core.annotation.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	private String driverName;

	public void drive() {
		System.out.println("I'm driving car");
	}

	public String getDriverName() {
		return driverName;
	}

	@Value(value = "samy")
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "Car [driverName=" + driverName + "]";
	}
}
