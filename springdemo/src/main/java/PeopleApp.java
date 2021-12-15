

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.People;


public class PeopleApp {

	public static void main(String[] args) {


		//IOC-- Control of Creation of Objects is given to xml file(loose coupling)
		ApplicationContext appCon=new ClassPathXmlApplicationContext("PeopleConfig.xml");
		People factory=(People)appCon.getBean("People",People.class);
		factory.display();
        
		
		
	}

}
