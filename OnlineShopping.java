package com.practicesession2.constructor;

public class OnlineShopping {

	public void calculateBillAmount(double shoppingAmount) {

		int discount;

		if(shoppingAmount > 0) {
			
			if (shoppingAmount < 1000) {

				discount = 0;

				System.out.println("Shopping Amount = " + shoppingAmount);
				System.out.println("Discount = " + discount + "%");
				System.out.println("Discount Amount = 0.0");
				System.out.println("Payable amount = " + shoppingAmount);

			} else if (shoppingAmount >= 1000 && shoppingAmount <= 4999) {

				discount = 5;

				System.out.println("Shopping Amount = " + shoppingAmount);
				System.out.println("Discount = " + discount + "%");
				System.out.println("Discount Amount = " + (shoppingAmount * discount / 100));
				System.out.println("Payable amount = " + (shoppingAmount - (shoppingAmount * discount / 100)));

			} else if (shoppingAmount >= 5000 && shoppingAmount <= 9999) {

				discount = 10;

				System.out.println("Shopping Amount = " + shoppingAmount);
				System.out.println("Discount = " + discount + "%");
				System.out.println("Discount Amount = " + (shoppingAmount * discount / 100));
				System.out.println("Payable amount = " + (shoppingAmount - (shoppingAmount * discount / 100)));

			} else {

				discount = 20;

				System.out.println("Shopping Amount = " + shoppingAmount);
				System.out.println("Discount = " + discount + "%");
				System.out.println("Discount Amount = " + (shoppingAmount * discount / 100));
				System.out.println("Payable amount = " + (shoppingAmount - (shoppingAmount * discount / 100)));

			}

		} else {
			
			System.out.println("Invalid shopping amount.");
			
		}

		}
}
