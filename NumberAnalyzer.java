package com.practicesession2.constructor;

public class NumberAnalyzer {

	public void checkEvenOdd(int number) {
		
		if(number % 2 == 0) {
			
			System.out.println("Number is even.");
			
		} else {
			
			System.out.println("Number is odd.");
			
		}
		
	}
	
	public void checkPositiveNegative(int number) {
		
		if(number > 0) {
			
			System.out.println("Number is positive.");
			
		} else if (number < 0) {
			
		   System.out.println("Number is negative.");	
		
		} else {
			
			System.out.println("Number is zero.");
			
		}
		
	}
	
	public void checkDivisibleBy5(int number) {
		
		if(number % 5 == 0) {
			
			System.out.println("Number is divisible by 5.");
			
		} else {
			
			System.out.println("Number is not divisible by 5.");
			
		}
		
	}
	
	public void checkGreater(int a, int b) {
		
		if(a > b) {
			
			System.out.println(a+" is greater than "+b+".");
			
		} else if (b > a) {
			
			System.out.println(b+" is greater than "+a+".");
			
		} else {
			
			System.out.println("Both are equal.");
			
		}
		
	}
	
}
