package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2
{

	public static void main(String[] args) 
	{
		
		ProductTableCreation obb = new ProductTableCreation();		
		Connection con = ConnectionProvider.createConnection();
		 Scanner sc = new Scanner(System.in);
		try 
		{
		 Statement statement= con.createStatement();
		 
		 int prod_code;
		 String prod_name;
		 int prod_price;
		 String prod_catg;
		
		 System.out.println("Sample Input");
		 System.out.println("EnterProduct Code");
		 
		 int code1 = sc.nextInt();
		 
		 String query1 = "select * from Products where prod_code ="+code1;
		 ResultSet result1 = statement.executeQuery(query1);
		 System.out.println(result1);
		 
		 System.out.println("Sample Output");
		 System.out.println("Product Details");
		 
		 
			 while(result1.next()) 
			 {
				 prod_code=result1.getInt(1);
				 prod_name=result1.getString(2);
				 prod_price=result1.getInt(3);
				 prod_catg=result1.getString(4);
			    System.out.println("Code :" +prod_code);
			    System.out.println("Name :" +prod_name);
			    System.out.println("Price :" +prod_price);
			    System.out.println("Category :" +prod_catg);
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
