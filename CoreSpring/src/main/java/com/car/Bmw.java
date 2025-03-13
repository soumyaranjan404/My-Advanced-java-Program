package com.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bmw implements Car {
    @Value("${car.bmw}")
	String name;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("the car"+name+"started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
