package com.practicesession2.constructor;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public double calculateArea() {
		
		return length * breadth;
		
	}
	
	public double calculatePerimeter() {
		
		return 2 * (length + breadth);
		
	}
	
	public void displayDetails() {
		
		System.out.println("Area of rectangle = "+calculateArea());
		System.out.println("Perimeter of rectangle = "+calculatePerimeter());
		
	}

}
