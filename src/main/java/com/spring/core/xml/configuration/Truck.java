package com.spring.core.xml.configuration;

public class Truck implements Vehicle {

	private String driverName;
	private Motor motor;

	public Truck() {
		System.out.println("empty constructor");
	}

	public Truck(String driverName, Motor motor) {
		this.driverName = driverName;
		this.motor = motor;
	}

	public void drive() {
		System.out.println("I'm driving truck");
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Truck [driverName=" + driverName + ", motor=" + motor + "]";
	}

}
