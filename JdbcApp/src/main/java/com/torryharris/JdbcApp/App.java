package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.torryharris.JdbcApp.EmployeeDoa;
import com.torryharris.JdbcApp.Employee;

public class App 
{
public static void main( String[] args )
{

Connection con=null;
try {
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch98", "root", "root");
 
Statement statement= con.createStatement();

String query="create table department(dptid int(9) PRIMARY KEY,dptname varchar(50), dptloc varchar(50)) ";
boolean result1 = statement.execute(query);
System.out.println(result1);


 String query1="insert into department values(101,'IT','Bangalore')";
 int result2 = statement.executeUpdate(query1);
 System.out.println(result2);

 int id;
 String dptname,loc;
 String query2="select * from employee";
 ResultSet result3 = statement.executeQuery(query2);
 
 while(result3.next()) {
id=result3.getInt(1);
 dptname=result3.getString(2);
 loc=result3.getString(3);
 System.out.println(id+" "+dptname+" "+loc);
}


 }
 catch(SQLException ex) {
System.err.println(ex);

 }
 finally
 {
 try 
 {
 con.close();
} 
 catch (SQLException e) 
 {

 e.printStackTrace();
 }
 }

		/*
		System.out.println("Press 1 to add employee");
		System.out.println("Press 2 to view employee");
		System.out.println("Press 3 to delete employee");
		System.out.println("Press 4 to update employee");
		
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		
		int id; String name,department;
		
		switch(choice) {
		case 1:
		System.out.println("enter id:");
		id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter department:");
		department=sc.next();
		
		Employee emp=new Employee(id, name, department);
		
		boolean flag = EmployeeDoa.addEmployee(emp);
		if(flag) {
		System.out.println("Employee Added");
		}
		else {
		System.err.println("Something went wrong");
		}
		break;
	
		case 2: boolean f= StudentDoa.viewEmployee();
		if(f)
		{
		System.out.println("Above are the Employee details");
		}
		else
		{
		System.err.println("Something went wrong");
		}
		break;
		case 3:System.out.println("enter Employee id to delete:");
		reg_no=sc.nextInt();
		boolean f1=EmployeeDoa.deleteEmployee(reg_no);
		if(f1)
		{
		System.out.println("Employee is successfully deleted");
		}
		else
		System.err.println("Something went wrong");
		break;
		case 4:
		}
		sc.close();
		
				}*/

	}
}