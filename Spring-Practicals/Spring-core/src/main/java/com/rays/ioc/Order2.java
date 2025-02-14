package com.rays.ioc;

public class Order2 {
	private Payment payment ;
	private Inventory inventory ;
	//by constructor injection
	
	public Order2(Payment payment, Inventory inventory) {
		this.payment = payment ;
		this.inventory = inventory ;
	}
	public void bookTicket(int items) {
		int price = 10 ;
		double totalAmount = items*price;
		double updateBalance =payment.makePayment(totalAmount);
		int updateStock = inventory.sold(items);
		
		System.out.println("tickets are booked");
		System.out.println("total Amount paid"+totalAmount);
		System.out.println("remaining balance"+updateBalance);
		System.out.println("update stock"+ updateStock);
	}

}
