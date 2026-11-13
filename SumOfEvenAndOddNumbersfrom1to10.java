package com.practicesession.loops;

public class SumOfEvenAndOddNumbersfrom1to10 {
	
	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i =1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				
				sum1 += i;
				
			} else {
				
				sum2 += i;
				
			}
			
		}
		
		System.out.println("Sum of Even numbers from 1 to 10 = "+sum1);
		System.out.println("Sum of Odd numbers from 1 to 10 = "+sum2);
		
	}

}
