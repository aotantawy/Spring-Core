package com.spring.core.annotation.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

	@Value(value = "mar22fc")
	private String modelNumber;

	@Value(value = "15.5")
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
