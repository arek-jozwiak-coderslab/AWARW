package pl.coderslab.day1.kolekcje1;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Set<String> myHashSet = new HashSet<>();
		myHashSet.add("1");
		myHashSet.add("2");
		myHashSet.add("5");
		myHashSet.add("3");
		myHashSet.add("b");
		myHashSet.add("a");

		for (String string : myHashSet) {
			System.out.print(string.hashCode() + " : ");
			System.out.println(string);
		}

	}

}
