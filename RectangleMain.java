package com.practicesession2.constructor;

import java.util.Scanner;

public class RectangleMain {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length : ");
		double length = sc.nextDouble();
		
		System.out.print("Enter breath : ");
		double breadth = sc.nextDouble();

		Rectangle r = new Rectangle(length, breadth);
		
		r.displayDetails();
		
		sc.close();
		
		
	}

}
