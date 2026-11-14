package com.practicesession.loops;

import java.util.Scanner;

public class GenerateSeriesQuestion2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		int num = 1;
		
		for(int i = 1; i <= range; i++) {
			
			System.out.print(num+" ");
			num = num  * 10 + 1;
			
		}
		
		sc.close();

	}

}
