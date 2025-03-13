package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Driver.Driver;
import com.configu.Config;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
	

		Driver dr=con.getBean(Driver.class);
        dr.startCar();
	}

}
