package com.practicesession2.constructor;

import java.util.Scanner;

public class MovieTicketMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String movieName;
		String customerName;
		double ticketPrice;
		int numberOfTickets;
		
		System.out.print("Enter Movie Name : ");
		movieName = sc.nextLine();
		
		System.out.print("Enter Customer Name : ");
		customerName = sc.nextLine();
		
		System.out.print("Enter ticket price : ");
		ticketPrice =sc.nextDouble();
		
		System.out.print("Enter number of tickets : ");
		numberOfTickets =sc.nextInt();
		
		MovieTicket m = new MovieTicket(movieName, customerName, ticketPrice, numberOfTickets);
		
		m.display();
		m.billAmount();
		m.discount();
		
		sc.close();
		
	}

}
