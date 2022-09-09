package com.lulu.assessment;

import java.util.Scanner;

public class SchoolRecords {
	Scanner sc = new Scanner(System.in);

	String schoolName = sc.next();
	int schoolID = sc.nextInt();
	String schoolAddress = sc.next();

	void addRecords() {

		System.out.println("Records are added");

	}

	void dispRecords() {
		System.out.println("Display records");
		System.out.println(schoolName);
		System.out.println(schoolID);
		System.out.println(schoolAddress);
	}

	public static void main(String[] args) {
		System.out.println("Enter the records:");

		SchoolRecords sr = new SchoolRecords();

		sr.addRecords();

		sr.dispRecords();

		System.out.println("The list are added");

	}

}

//WAP to create Class "SchoolRecords" create 3 data members as school name ,School ID ,School Address to create 
//records of schools in chennai, Create Method to add all records[ddRecords()] and display all records[dispRecords()]