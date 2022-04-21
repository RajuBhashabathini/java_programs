package com.torryharris.JdbcApp;

public class Products
{
	private int prod_code;
	private String prod_name;
	private int prod_price;
	private String prod_catg;
	
	public Products(int prod_code, String prod_name, int prod_price, String prod_catg)
	{
	this.prod_code=prod_code;
	this.prod_name=prod_name;
	this.prod_price=prod_price;
	this.prod_catg=prod_catg;
	}
	
	public int getProd_code() 
	{
	return prod_code;
	}
	
	public void setProd_code(int prod_code) 
	{
	this.prod_code = prod_code;
	}
	
	public String getProd_name()
	{
	return prod_name;
	}
	
	public void setProd_name(String prod_name) 
	{
	this.prod_name = prod_name;
	}
	
	public int getProd_price()
	{
	return prod_price;
	}
	
	public void setProd_price(int prod_price) 
	{
	this.prod_price = prod_price;
	}
	
	public String getProd_catg()
	{
	return prod_catg;
	}
	
	public void setProd_catg(String prod_catg) 
	{
	this.prod_catg = prod_catg;
	}
	
	@Override
	public String toString()
	{
	return "insert into products(prod_code,prod_name,prod_price,prod_catg) values("+prod_code+",'"+prod_name+"',"+prod_price+",'"+prod_catg+"')";
	}
}