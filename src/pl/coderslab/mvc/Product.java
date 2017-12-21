package pl.coderslab.mvc;

public class Product {

	private String name;
	private String description;
	private double price;
	private int id;
	
	
	
	public Product(String name, String description, double price, int id) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
