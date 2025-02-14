package com.rays.ioc;

public class Order1 {
	private Payment payment ;
	private Inventory inventory ;
	
	
	
	//by Setter injection 
	public void setPayment(Payment payment) {
		this.payment =payment ;
		
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
		
	}
	public void bookTicket(int items) {
		int price = 10 ;
		double totalAmount = items *price;
		double updateBalance = payment.makePayment(totalAmount);
		
		int updateStock = inventory.sold(items);
		System.out.println("TIckets are Booked");
		System.out.println("Total Amount Paid"+ totalAmount);
		System.out.println("Total Amount Paid"+updateBalance);
		System.out.println("update stock"+updateStock);
	}
	

}
