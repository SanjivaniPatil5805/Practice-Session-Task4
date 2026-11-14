package com.practicesession2.constructor;

import java.util.Scanner;

public class NumberAnalyzerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NumberAnalyzer n = new NumberAnalyzer();
		
		System.out.print("Enter a number to check even odd : ");
		int number1 = sc.nextInt();
		n.checkEvenOdd(number1);
		
		System.out.print("Enter a number to check positive negative : ");
		int number2 = sc.nextInt();
		n.checkPositiveNegative(number2);
		
		System.out.print("Enter a number to check divisible by 5 : ");
		int number3 = sc.nextInt();
		n.checkDivisibleBy5(number3);
		
		System.out.print("Enter first number to check greater number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number to check greater number : ");
		int b = sc.nextInt();
		n.checkGreater(a, b);
		
		sc.close();
		
		
	}

}
