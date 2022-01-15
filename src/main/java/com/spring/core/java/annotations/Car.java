package com.spring.core.java.annotations;

public class Car implements Vehicle {

	private String driverName;

	private Motor motor;

	public Car() {
		System.out.println("empty constructor");
	}

	public Car(String driverName, Motor motor) {
		this.driverName = driverName;
		this.motor = motor;
	}

	public void drive() {
		System.out.println("I'm driving car");
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
		return "Car [driverName=" + driverName + ", motor=" + motor + "]";
	}

}
