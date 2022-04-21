package com.shad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.shad.model.Employee;

@Component
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(Employee employee) {

		String sql = "INSERT INTO employee (name, age, salary) VALUES(?,?,?)";

		jdbcTemplate.update(sql, new Object[] { employee.getName(), employee.getAge(), employee.getSalary() });
	}

	public void update(Employee employee) {

		String sql = "UPDATE employee SET name=?, age=?, salary=? WHERE id =?";

		jdbcTemplate.update(sql,
				new Object[] { employee.getName(), employee.getAge(), employee.getSalary(), employee.getId() });

	}

	public void delete(int employeeId) {

		String sql = "DELETE FROM employee WHERE id =?";

		jdbcTemplate.update(sql, new Object[] { employeeId });

	}

	public List<Employee> getAll() {

		String sql = "SELECT  * FROM employee";

		List<Employee> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));

		return result;
	}

	public Employee getOne(int employeeId) {

		String sql = "SELECT  * FROM employee WHERE id =?";

		List<Employee> result = jdbcTemplate.query(sql, new Object[] { employeeId },
				new BeanPropertyRowMapper(Employee.class));

		if (result.size() > 0) {
			return result.get(0);
		} else {
			return null;
		}
	}

}