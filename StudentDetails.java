package com.masaijava111;

public class StudentDetails {
	int rollNum;
	int marks;
	String name;
	void displayStudentDetails() {
		System.out.println("Roll is : "+rollNum);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}
	public static void main(String[] args) {
		StudentDetails std=new StudentDetails();
		std.rollNum=53;
		std.name="Vikas";
		std.marks=7;
		std.displayStudentDetails();
		StudentDetails std1=new StudentDetails();
		std1.rollNum=71;
		std1.name="Rupesh";
		std1.marks=6;
		std1.displayStudentDetails();
	}
}
