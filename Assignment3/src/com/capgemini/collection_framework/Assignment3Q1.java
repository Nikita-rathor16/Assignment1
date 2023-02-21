package com.capgemini.collection_framework;

import java.util.Set;
import java.util.TreeSet;

class person implements Comparable<person> {
	private String name;
	private int height;
	private double weight;

	// Creating constructor
	public person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void display() {
		System.out.println("name = " + getName() + ", height = " + getHeight() + ", weight = " + getWeight());
	}

	public int compareTo(person p) {
		if (this.weight == p.getWeight()) {
			if (this.height == p.getHeight()) {
				return 0;
			} else if (this.height > p.getHeight()) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.weight > p.getWeight()) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Assignment3Q1 {
	public static void main(String[] args) {
		Set<person> obj = new TreeSet<person>();

		person p1 = new person("John", 5, 25);
		person p2 = new person("Aman", 6, 55);
		person p3 = new person("Rahul", 4, 35);
		person p4 = new person("Ajay", 5, 55);

		obj.add(p1);
		obj.add(p2);
		obj.add(p3);
		obj.add(p4);

		for (person p : obj) {
			p.display();
		}

	}

}