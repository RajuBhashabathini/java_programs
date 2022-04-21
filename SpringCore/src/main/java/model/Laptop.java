package model;

public class Laptop {
	
	private String company;
	private Processor processor;

	public Laptop(String company) 
	{
		this.company = company;
	}

	public void drive()
	{

		processor.start();

		System.out.println(company + " Laptop is working");
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}