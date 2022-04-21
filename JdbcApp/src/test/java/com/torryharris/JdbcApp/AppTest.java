package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppTest
{
	public static void main( String[] args )
	{
	
	Connection con=null;
	try 
		{
		//opening connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/torry_haris", "root", "system");
		
		//executing querries
		
		Statement statement= con.createStatement();
		// String query="create table department(dptid int(9) PRIMARY KEY,dptname varchar(50), dptloc varchar(50)) ";
		// boolean result = statement.execute(query);
		// System.out.println(result);
		
		//
		// String query="insert into department values(101,'IT','Bangalore')";
		// int result = statement.executeUpdate(query);
		// System.out.println(result);
		
		int id;
		String dptname,loc;
		String query="select * from employee";
		ResultSet result = statement.executeQuery(query);
		while(result.next()) 
			{
			id=result.getInt(1);
			dptname=result.getString(2);
			loc=result.getString(3);
			System.out.println(id+" "+dptname+" "+loc);
			}
	    }
	catch(SQLException ex) 
		{
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	
	}
}