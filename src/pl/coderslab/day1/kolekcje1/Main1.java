package pl.coderslab.day1.kolekcje1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		

		// create list
		List<Integer> elements = new ArrayList<>();
		// add elements to list
		for (int i = 10; i <= 20; i++) {
			elements.add(i);
		}
		// for
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i));
		}
		System.out.println("-------------------------------");
		// while and iterator
		Iterator<Integer> it = elements.iterator();
		while (it.hasNext()) {
			Integer integerValue = it.next();
			System.out.println(integerValue);

		}
		System.out.println("-------------------------------");
		for (Iterator<Integer> iter = elements.iterator(); iter.hasNext();) {
			Integer integer = iter.next();
			System.out.println(integer);
		}
		System.out.println("-------------------------------");

		for (Integer integer : elements) {
			System.out.println(integer);
		}
		System.out.println("-------------------------------");
		System.out.println("java 8");
		
		elements.stream().forEach(System.out::println);

	}

}
