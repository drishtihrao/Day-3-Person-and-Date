package com.cg.assignment.person;

import com.cg.assignment.date.Datee;

public class Person {

	private String name;
	private Datee dob;

	// Parameterized constructor that sets the name and date of the person
	public Person(String n, int d, int m, int y) {
		name = n;
		dob = new Datee(d, m, y);
	}

	// Display details of a person
	public void display() {
		int[] dateDiff = new int[3];
		System.out.println("Name: " + name);
		System.out.println("Date of birth: " + dob);
		dateDiff = dob.age();
		System.out.println("Age: " + dateDiff[2] + " Years " + dateDiff[1] + " Months " + dateDiff[0] + " Days ");
	}

	// Find and display the older person of two persons
	public void olderOne(Person p) {
		int[] dateDiff = new int[3];
		if (dob.isSmaller(p.dob)) {
			dateDiff = dob.diff(p.dob);
			System.out.println(p.name + " is older than " + name + " by " + dateDiff[2] + " years, " + dateDiff[1]
					+ " months and " + dateDiff[0] + " Days ");
		} else {
			dateDiff = p.dob.diff(dob);
			System.out.println(name + " is older than " + p.name + " by " + dateDiff[2] + " years, " + dateDiff[1]
					+ " months and " + dateDiff[0] + " Days ");
		}
	}
}