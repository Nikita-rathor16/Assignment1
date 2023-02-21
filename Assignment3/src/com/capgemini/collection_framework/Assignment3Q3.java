package com.capgemini.collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {

	public static List traverseReverse(ArrayList<Integer> aList) {
		List<Integer> l = new ArrayList();
		ListIterator<Integer> iterator = aList.listIterator();
		while (iterator.hasNext()) {

			iterator.next();
		}

		while (iterator.hasPrevious()) {
			l.add(iterator.previous());

		}
		return l;

	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(traverseReverse(list));

	}
}