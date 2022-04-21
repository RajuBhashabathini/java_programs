package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Car;

public class Testing {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringLaptop.xml");

		Laptop laptop = (Laptop) context.getBean("laptop");
		laptop.drive();
		
	//Processor processor = context.getBean(Processor.class);
		//processor.start();
	}
}
