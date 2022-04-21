package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductDemo4 
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
			
			 String query1 = "Select prod_code from Products where prod_catg = 'Electronics' and prod_price < 1000 ";
			 ResultSet result1 = statement.executeQuery(query1);
			 
			 String query2 = "Select prod_code from Products where prod_catg = 'Clothing' and prod_price > 1000 ";
			 ResultSet result2 = statement.executeQuery(query2);
			 
			 System.out.println(result1);
			 System.out.println(result2);
			
			/* while(result1.next()) 
			 {
				 prod_code=result1.getInt(1);
				 prod_name=result1.getString(2);
				 prod_price=result1.getInt(3);
				 prod_catg=result1.getString(4);
			    System.out.println(prod_code+" "+prod_name+" "+prod_price+" "+prod_catg);
			 }

			 while(result2.next()) 
			 {
				 prod_code=result2.getInt(1);
				 prod_name=result2.getString(2);
				 prod_price=result2.getInt(3);
				 prod_catg=result2.getString(4);
			    System.out.println(prod_code+" "+prod_name+" "+prod_price+" "+prod_catg);
			 }*/
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
