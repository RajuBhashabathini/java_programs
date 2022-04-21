package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Car;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car car = (Car) context.getBean("car");
		car.drive();
		
	// Engine engine = context.getBean(Engine.class);
	//	engine.start();
	}
}