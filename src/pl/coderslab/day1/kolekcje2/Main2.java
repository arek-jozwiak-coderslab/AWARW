package pl.coderslab.day1.kolekcje2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Map<String, String> map = getMap();
		System.out.println("Podaj odpowiedź");
		Scanner scan = new Scanner(System.in);
		int count = 0;
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			String s = scan.next();
			if (s.equals(map.get(key))) {
				count++;
			}
		}
		System.out.println("Poprawnych odpowiedzi" + count);
		scan.close();
	}

	public static Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>();
		map.put("Ciepło", "Zimno");
		map.put("Jasno", "Ciemno");
		map.put("Dzień", "Noc");
		map.put("Szybko", "Wolno");
		map.put("Biały", "Czarny");
		return map;
	}
}

//http://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html