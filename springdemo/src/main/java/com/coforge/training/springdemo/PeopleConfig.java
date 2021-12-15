package com.coforge.training.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springdemo.model.People;

//configuring spring beans without XML
//DI using setter by annotation

/*@Configuration annotation indicates that a class declares one or more 
 * @Bean methods and may be processed by the Spring container to generate 
 * bean definitions and service requests for those beans at runtime.*/

/*The @ComponentScan annotation is used with the @Configuration annotation 
 * to tell Spring the packages to scan for annotated components.*/



@Configuration
@ComponentScan("com.coforge.training.springdemo.model")
public class PeopleConfig {
	
	/*    @Bean is a method-level annotation and a direct analog of the XML <bean/> element. */
	
	@Bean(name="people")
	public People getPeople() {
		
		People p=new People();
		p.setName("Kristen");
		p.setAge(31);
		return p;
	}
	

}
