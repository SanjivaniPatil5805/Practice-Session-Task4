package com.practicesession2.constructor;

import java.util.Scanner;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Salary : ");
		double salary = sc.nextDouble();
		
		System.out.print("Enter Experience :");
		int experience = sc.nextInt();
		
		Employee e = new Employee();
		
		e.calculateBonus(salary, experience);
		
		sc.close();
		
	}

}
