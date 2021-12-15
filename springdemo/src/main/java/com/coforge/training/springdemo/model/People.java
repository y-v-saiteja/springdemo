package com.coforge.training.springdemo.model;

import org.springframework.stereotype.Component;

//Setter injection with the help of annotations
@Component //spring automatically detects our Bean-file
public class People {
	
	String name;
    int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
	public void display()
    {
        System.out.println("*********** Person Details **************");
        System.out.println(name+ " is "+age+ " old.");
    }
	
}
