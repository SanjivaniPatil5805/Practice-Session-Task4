package com.practicesession.loops;

import java.util.Scanner;

public class OddNumbersWithStartAndEndVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Position : ");
		int start = sc.nextInt();
		
		System.out.print("Enter End Position : ");
		int end = sc.nextInt();

		if(start < end) {
			
			for (int i = start; i <= end; i++) {

				if (i % 2 == 1) {

					System.out.println(i);

				}

			}
			
		} else {
			
			System.out.println("Start position must be smaller than end position.");
			
		}
		
		sc.close();

	}

	
}
