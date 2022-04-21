package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListAllProducts
{

	public static void main(String[] args)
	{
		ProductTableCreation obb = new ProductTableCreation();
	
		Connection con = ConnectionProvider.createConnection();
		try 
		{
	     Statement statement= con.createStatement();
	     
		 int prod_code;
		 String prod_name;
		 int prod_price;
		 String prod_catg;
		 
		 String query7="select * from products";
		 ResultSet result8 = statement.executeQuery(query7);
		 
			 while(result8.next()) 
			 {
				 prod_code=result8.getInt(1);
				 prod_name=result8.getString(2);
				 prod_price=result8.getInt(3);
				 prod_catg=result8.getString(4);
			    System.out.println(prod_code+" "+prod_name+" "+prod_price+" "+prod_catg);
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
				 e.printStackTrace();
				 }			 

	        }
	}
}
