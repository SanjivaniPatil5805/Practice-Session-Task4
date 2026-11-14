package com.practicesession.loops;

import java.util.Scanner;

public class CountOfFactorsOfANumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		System.out.print("Factors of "+ num +" : ");
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				System.out.print(i + " ");
				count++;
				
			}
			
		}
		
		System.out.println();
		System.out.println("Count of factors : "+count);
		
		sc.close();
		
		
	}

}
