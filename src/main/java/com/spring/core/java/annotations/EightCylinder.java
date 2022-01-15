package com.spring.core.java.annotations;

import org.springframework.stereotype.Component;

@Component
public class EightCylinder implements Motor {

	@Override
	public String toString() {
		return "EightCylinder";
	}

}
