package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Book;

public class BookApp {

	public static void main(String[] args) {
		
		//IOC-- Control of Creation of Objects is given to xml file(loose coupling)
		ApplicationContext appCon=new ClassPathXmlApplicationContext("BookConfig.xml");
        Book factory=(Book)appCon.getBean("b1");
        factory.show();
        
        //Traditional Approach of creation of objects
        Book b1=new Book(10,"Two's Company",500L);
        b1.show();
		
	}

}
