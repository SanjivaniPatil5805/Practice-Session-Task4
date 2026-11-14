package com.practicesession2.constructor;

import java.util.Scanner;

public class OnlineShoppingMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Shopping Amount : ");
		double amount = sc.nextDouble();
		
		OnlineShopping o = new OnlineShopping();
		
		o.calculateBillAmount(amount);
		
		sc.close();
		
	}

}
