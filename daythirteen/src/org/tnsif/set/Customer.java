package org.tnsif.set;

public class Customer {
	private String name;
	private String city;
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//non-parameterized constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}
	

}
