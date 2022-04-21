package model;

public class Car {

	private String company;
	private Engine engine;

	public Car(String company) {
		this.company = company;
	}

	public void drive() {

		engine.start();

		System.out.println(company + " Car is moving");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}