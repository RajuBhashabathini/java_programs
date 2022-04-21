package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.config.SpringConfig;
import com.shad.model.Laptop;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Laptop laptop = context.getBean(Laptop.class);

		laptop.boot();
	}
}