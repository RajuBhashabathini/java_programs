package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductTableCreation 
{
	public static void main( String[] args )
	{
		Connection con=null;
		try 
		{
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch98", "root", "root");
			 
			 Statement statement= con.createStatement();
			 
			 String query1="create table Products(prod_code int(10) PRIMARY KEY,prod_name varchar(15), prod_price int(25),prod_catg varchar(15)) ";
			 boolean result1 = statement.execute(query1);
			 System.out.println(result1);
			 
			 String query2="insert into Products values(101,'Laptop',40000,'Electronics')";
			 int result2 = statement.executeUpdate(query2);
			 System.out.println(result2);		 
	
			 String query3="insert into Products values(102,'keyboard',500,'Electronics')";
			 int result3 = statement.executeUpdate(query3);
			 System.out.println(result3);
	
			 String query4="insert into Products values(103,'Mouse',350,'Electronics')";
			 int result4 = statement.executeUpdate(query4);
			 System.out.println(result4);
	
			 String query5="insert into Products values(104,'T-Shirt',900,'Clothing')";
			 int result5 = statement.executeUpdate(query5);
			 System.out.println(result5);		 
	
			 String query6="insert into Products values(105,'Jeans',1500,'Clothing')";
			 int result6 = statement.executeUpdate(query6);
			 System.out.println(result6);	 

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
				 e.printStackTrace();
			 }
		 }
	}
}
