package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.springIoc.Person;
import com.springIoc.ShowMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
       
       ShowMessage msg=context.getBean("msg",ShowMessage.class);
       
      //Person per=context.getBean("person", Person.class);
      
      //System.out.println(per.getPerson());
       
       msg.getMsg();
       
    }
}
