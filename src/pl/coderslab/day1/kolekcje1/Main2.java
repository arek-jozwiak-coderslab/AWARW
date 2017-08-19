package pl.coderslab.day1.kolekcje1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

	public static List<Integer> removeDivider(List<Integer> list, int divider) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			if (it.next() % divider == 0) {
				it.remove();
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>();
		elements.add(2);
		elements.add(3);
		elements.add(6);
		elements.add(7);
		elements.add(9);
		elements.add(11);

		List<Integer> removedList = removeDivider(elements, 2);
		for (Integer integer : removedList) {
			System.out.println(integer);
		}

	}
}
// https://stackoverflow.com/questions/28112309/unsupportedoperationexception-when-using-iterator-remove