package com.practicesession.loops;

import java.util.Scanner;

public class FibonacciSeriesOfRange{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter range : ");
		int range = sc.nextInt();
		
		int num1 = 0; 
		int num2 = 1;
		
		for(int i = 1; i <= range; i++) {
			
			System.out.println(num1+ " ");
			int num3 = num1 + num2;
			num1= num2;	
			num2= num3;
			
		}

		sc.close();
		
	}

}
