package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.config.SpringConfig;
import com.shad.dao.EmployeeDAO;
import com.shad.model.Employee;

public class JdbcDemo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		Employee employee = new Employee();
		employee.setAge(35);
		employee.setName("Shadab");
		 employee.setSalary(5432);

	//	employeeDAO.insert(employee);

		//employee.setId(1);
		//employee.setSalary(223344);

		// employeeDAO.update(employee);

		// employeeDAO.delete(1);
		// System.out.println("Employee deleted Successfully");
		
		Employee e = employeeDAO.getOne(39);
		System.out.println(e);

		List<Employee> allEmps = employeeDAO.getAll();
		System.out.println(allEmps);

	}

}