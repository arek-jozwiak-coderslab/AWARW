package pl.coderslab.mvc;

public class Burger {

	private int id;
	private String name;
	private int rating;

	public Burger() {
	}

	public Burger(int id, String name, int rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
