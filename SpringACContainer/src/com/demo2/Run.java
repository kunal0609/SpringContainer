package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      App obj = (App) context.getBean("app");
	      
	      obj.getMessage();
	   }
	
}
