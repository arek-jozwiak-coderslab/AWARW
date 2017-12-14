package pl.coderslab.day1.kolekcje2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	private static final String MESSAGE_PRINT_TEMPLATE = "Podanych napisów: %d, Rozmiar kolekcji: %s";
	private static final String MESSAGE_PRINT_SUMMARY = "Napisy z kolekcji:";
	private static final String EXIT_STRING = "exit";

	public static void main(String[] args) {
		System.out.println("Podaj napis:");
		Scanner scan = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		int count = 0;
		while (scan.hasNextLine()) {
			String s = scan.next();
			if (s.equals(EXIT_STRING)) {
				System.out.println("Exit");
				break;
			}
			set.add(s);
			count++;

		}
		System.out.println(String.format(MESSAGE_PRINT_TEMPLATE, count, set.size()));
		System.out.println(MESSAGE_PRINT_SUMMARY);
		for (String string : set) {
			System.out.println(string);
		}
		scan.close();
	}
}
