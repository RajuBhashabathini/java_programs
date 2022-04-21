package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.torryharris.JdbcApp.ConnectionProvider;
import com.torryharris.JdbcApp.Employee;

public class EmployeeDoa
{
		public static boolean addEmployee(Employee emp)
		{
			Connection con = ConnectionProvider.createConnection();
			Boolean flag=false;
			String query="insert into employee values(?,?,?)";		
			try
			{
				PreparedStatement pstmt= con.prepareStatement(query);
				pstmt.setInt(1, emp.getEmpId());
				pstmt.setString(2,emp.getEmpName());
				pstmt.setString(3, emp.getDepartment());			
				pstmt.executeUpdate();
				flag=true;		
			}
			catch (SQLException e) 
			{
			e.printStackTrace();
			}			
			return flag;	
		}
		
		public static boolean viewEmployee()
		{
			Connection con = ConnectionProvider.createConnection();
			boolean flag=false;
			String query="select * from Employee";
			try
			{
				int reg_no;
				String name;
				String branch;
				PreparedStatement pstmt= con.prepareStatement(query);
				ResultSet b=pstmt.executeQuery();
				while(b.next())
				{
					reg_no=b.getInt(1);
					name=b.getString(2);
					branch=b.getString(3);
					System.out.println(reg_no+" "+name+" "+branch);
				}
				flag= true;
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return flag;
		}
		
		public static boolean deleteEmployee(int reg_no)
		{
			Connection con = ConnectionProvider.createConnection();
			Boolean flag=false;
			String query="delete from Employee where reg_no=?";
			try
			{
				PreparedStatement pstmt= con.prepareStatement(query);
				pstmt.setInt(1,reg_no);
				pstmt.executeUpdate();
				flag=true;
			}
			catch(SQLException e)
			{
				e.printStackTrace();
	 	    }
		return flag;
	    }
}