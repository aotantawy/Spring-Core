package com.spring.core.xml.configuration;

public class Motor {

	private String modelNumber;
	private double horsePower;

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Motor [modelNumber=" + modelNumber + ", horsePower=" + horsePower + "]";
	}

}
