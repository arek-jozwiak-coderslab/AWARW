package pl.coderslab.day1.kolekcje1;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static List<City> initialize() {
		City city1 = new City("city1", 100000);
		City city2 = new City("city2", 200000);
		City city3 = new City("city3", 300000);
		City city4 = new City("city4", 400000);
		City city5 = new City("city5", 500000);

		List<City> listOfCities = new ArrayList<>();
		listOfCities.add(city1);
		listOfCities.add(city2);
		listOfCities.add(city3);
		listOfCities.add(city4);
		listOfCities.add(city5);

		return listOfCities;
	}

	public static List<City> sublist(List<City> list, int start, int end) {
		return list.subList(start, end);
	}

	public static void main(String[] args) {
		List<City> newList = initialize();
		System.out.println(newList);
		List<City> sublistedList = sublist(newList, 2, 5);
		System.out.println(sublistedList);
	}
}