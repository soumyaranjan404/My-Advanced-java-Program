package com.springIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("msg")
public class ShowMessage {
	
	@Autowired
	private Person person;
	
	public void getMsg() {
//		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);	       
//	      person=context.getBean("person", Person.class);
		System.out.println("Hello How Are you:"+person.getPerson());
	}

}
