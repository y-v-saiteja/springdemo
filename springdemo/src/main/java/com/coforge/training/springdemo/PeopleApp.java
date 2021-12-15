package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.training.springdemo.model.People;


public class PeopleApp {

	public static void main(String[] args) {


		//IOC-- Control of Creation of Objects is given to xml file(loose coupling)
		ApplicationContext appCon=new AnnotationConfigApplicationContext(PeopleConfig.class);
		
		People factory=(People)appCon.getBean("people");
		factory.display();
        
		
		
	}

}
