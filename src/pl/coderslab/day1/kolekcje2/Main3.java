package pl.coderslab.day1.kolekcje2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
	public static List<Country> initialize() {
		Country country1 = new Country("Polska", "Warszawa");
		Country country2 = new Country("Niemcy", "Berlin");
		Country country3 = new Country("Grecja", "Ateny");
		Country country4 = new Country("Hiszpania", "Madryt");
		Country country5 = new Country("Norwegia", "Oslo");

		List<Country> listOfCountry = new ArrayList<>();
		listOfCountry.add(country1);
		listOfCountry.add(country2);
		listOfCountry.add(country3);
		listOfCountry.add(country4);
		listOfCountry.add(country5);

		return listOfCountry;
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public static Map<String, Country> getMap(List<Country> list) {
		Map<String, Country> map = new HashMap<>();
	
		for (Country country : list) {
			map.put(country.getCapital(), country);
		}
		
		return map;
	}

	public static void main(String[] args) {

		List<Country> newList = initialize();
		for (Country country : newList) {
			System.out.println(country.getName() + " " + country.getCapital());
		}
	}
}
