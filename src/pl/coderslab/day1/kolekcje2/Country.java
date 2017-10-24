package pl.coderslab.day1.kolekcje2;

public class Country {

	public Country(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	private String name;
	private String capital;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
