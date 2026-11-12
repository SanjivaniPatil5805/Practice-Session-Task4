package com.practicesession2.constructor;

public class MovieTicket {
	
	String movieName;
	String customerName;
	double ticketPrice;
	int numberOfTickets;
	double billAmount;
	
	public MovieTicket(String movieName, String customerName, double ticketPrice, int numberOfTickets) {
		
		this.movieName = movieName;
		this.customerName = customerName;
		this.ticketPrice = ticketPrice;
		this.numberOfTickets = numberOfTickets;
		
	}
	
	public void display() {
		
		System.out.println("----------------------------");
		System.out.println("Movie Name = "+movieName);
		System.out.println("Customer Name = "+customerName);
		System.out.println("Ticket Price = "+ticketPrice);
		System.out.println("Number of tickets = "+numberOfTickets);
		
	}
	
	public void billAmount() {
		
		billAmount = ticketPrice * numberOfTickets;
		
		System.out.println("Total ticket amount = "+ billAmount);
		
	}
	
	public void discount() {
		
		if(billAmount > 1000) {
			
			System.out.println("10% discount avalaible.");
			
			billAmount = billAmount - (0.10 * billAmount);
			
			System.out.println("Payable amount = "+billAmount);
			
		} else {
			
			System.out.println("No discount available.");
			
			System.out.println("Payable amount = "+billAmount);
			
		}
		
	}

}
