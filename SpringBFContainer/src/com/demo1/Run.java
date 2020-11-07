package com.demo1;

import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;  

public class Run {

	public static void main(String[] args) { 
		
	      XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
	      
	      App obj = (App) factory.getBean("app");    
	      obj.getMessage();    
	   }
	
}
