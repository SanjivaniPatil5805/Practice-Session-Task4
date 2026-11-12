package com.practicesession2.constructor;

public class Student {
	
	int rollNo;
	String name;
	double marks;
	
	public Student(int rollNo, String name, double marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
	}
	
	public void display() {
	
		System.out.println("Roll No. : "+rollNo);
		System.out.println("Student Name : "+name);
		System.out.println("Marks : "+marks);
		
	}

}
