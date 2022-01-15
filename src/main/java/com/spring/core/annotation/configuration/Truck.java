package com.spring.core.annotation.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

	@Value(value = "mahmoud")
	private String driverName;

	public void drive() {
		System.out.println("I'm driving truck");
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "Truck [driverName=" + driverName + "]";
	}
}
