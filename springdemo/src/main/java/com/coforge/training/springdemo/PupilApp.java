package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Pupil;

public class PupilApp {

	public static void main(String[] args) {
		
		//IOC-- Control of Creation of Objects is given to xml file(loose coupling)
				ApplicationContext appCon=new ClassPathXmlApplicationContext("PupilConfig.xml");
				Pupil factory=(Pupil)appCon.getBean("pupil1");
		        
				System.out.println("Pupil Details: ");
				System.out.println("Person Id: "+factory.getId());
				System.out.println("Person Name: "+factory.getName());
				factory.showHobbies();
		
		
		
	}

}
