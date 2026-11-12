package com.practicesession2.constructor;

public class Employee {
	
	public void calculateBonus(double salary, int experience) {
		
		double bonus;
		
		if(experience >= 5) {
			
			System.out.println("This employee get 20% bonus...");
			bonus = salary * 0.20;
			System.out.println("Salary = "+salary);
			System.out.println("Bonus = "+bonus); 
			System.out.println("Total salary = "+(salary + bonus));
			
		} else if(experience >= 3 && experience <= 4) {
			
			System.out.println("This employee get 10% bonus...");
			bonus = salary * 0.10;
			System.out.println("Salary = "+salary);
			System.out.println("Bonus = "+bonus); 
			System.out.println("Total salary = "+(salary + bonus));
			
		} else {
			
			System.out.println("This employee get 5% bonus...");
			bonus = salary * 0.05;
			System.out.println("Salary = "+salary);
			System.out.println("Bonus = "+bonus); 
			System.out.println("Total salary = "+(salary + bonus));
			
		}
		
	}

}
