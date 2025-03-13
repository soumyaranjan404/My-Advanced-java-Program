package com.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.car.Car;

@Component
public class Driver {
    @Qualifier("bmw")
	@Autowired
	Car car;


public void carStop()
{
car.stop();	
}
public void startCar() {
	// TODO Auto-generated method stub
	car.start();
}

}
