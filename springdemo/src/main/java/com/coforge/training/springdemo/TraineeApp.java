package com.coforge.training.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Address;
import com.coforge.training.springdemo.model.Trainee;

public class TraineeApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("TraineeConfig.xml");
		Trainee trainee=(Trainee)appCon.getBean("t1");


		//Process Student Object.
		System.out.println("Trainee info: ");
		System.out.println("Name: " + trainee.getName());
		System.out.println("RollNo: " + trainee.getRollNo());
		System.out.println("Class: " + trainee.getClassName());

		//Get Address from Student Object.
		List<Address> traineeAddressList = trainee.getAddress();



		//Declare program counter.
		int addressCounter = 1;



		//Iterate Address List.
		for (Address traineeAddress : traineeAddressList) {
		//Process Address Object.
		System.out.println("Trainee Address " +addressCounter+ ": ");



		System.out.println("City: " + traineeAddress.getCity());
		System.out.println("State: " + traineeAddress.getState());
		System.out.println("Country: " + traineeAddress.getCountry());
		System.out.println("Pin Code: " + traineeAddress.getPincode());
		addressCounter++;
		}

	}

}
