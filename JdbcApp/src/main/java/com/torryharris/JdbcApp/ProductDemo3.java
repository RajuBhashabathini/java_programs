package com.torryharris.JdbcApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductDemo3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Products");
		int n=sc.nextInt();
		int t=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter details for Product "+i);
			int prod_code=sc.nextInt();
			String prod_name=sc.next();
			int prod_price=sc.nextInt();
			String prod_catg=sc.next();
			Products p=new Products(prod_code,prod_name,prod_price,prod_catg);
			String querry=p.toString();
			
			try
			{
				Connection con = ConnectionProvider.createConnection();
				Statement statement = con.createStatement();
				int result=statement.executeUpdate(querry);
				t=t+result;
			}
			
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
			sc.close();
			if(t==n)
			{
			System.out.println("All Products Inserted");
		    }
	}
}
