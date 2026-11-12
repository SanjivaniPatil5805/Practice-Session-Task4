package com.practicesession2.constructor;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(111, "Priya", 88.97);
		Student s2 = new Student(112, "Raj", 78.76);
		Student s3 = new Student(113, "Maya", 74.98);
		
		System.out.println("--------Student Details-------");
		System.out.println();
		
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();
		s3.display();
		
		
	}
	
}
