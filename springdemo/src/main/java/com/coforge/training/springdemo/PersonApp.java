package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Person;

public class PersonApp {

	public static void main(String[] args) {
		
		//IOC-- Control of Creation of Objects is given to xml file(loose coupling)
		ApplicationContext appCon=new ClassPathXmlApplicationContext("PersonConfig.xml");
		Person factory=(Person)appCon.getBean("person1");
        
		System.out.println("Person Details: ");
		System.out.println("Person Id: "+factory.getId());
		System.out.println("Person Name: "+factory.getName());
		factory.showPhoneNos();


	}

}
