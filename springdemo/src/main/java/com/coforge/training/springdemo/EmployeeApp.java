package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Employee;


public class EmployeeApp {

	public static void main(String[] args) {
		
		 ApplicationContext appCon=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
	        Employee factory=(Employee)appCon.getBean("emp1");
	        factory.display();
	        System.out.println("I am Working from "+factory.getCity());
		
	}

}
