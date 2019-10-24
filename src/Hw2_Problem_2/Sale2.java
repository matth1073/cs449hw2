package Hw2_Problem_2;

import java.util.ArrayList;


public class Sale2 {
	private static double DISCOUNT_RATE = 0.05;
	private static double SENIOR_DISCOUNT_RATE = 0.10;
	private static double PREFERRED_DISCOUNT_RATE = 0.15;
	
	private ArrayList<Item2> itemList = new ArrayList<Item2>();
	
	public void addItem(Item2 item) {
		itemList.add(item);
	}
	public double getDiscountRate(char customer){
		char customerType = Character.toLowerCase(customer); 
		switch (customerType) {
		case 'r':
			return DISCOUNT_RATE;
		case 's':
			return SENIOR_DISCOUNT_RATE;
		case 'p':
			return PREFERRED_DISCOUNT_RATE;
		default:
			return DISCOUNT_RATE; 
		}
	}
	public double getDiscount(char customer){
		return getSubTotal()*getDiscountRate(customer);
	}
	
	public double getSubTotal() {
		double subTotal = 0.0;
		for (Item2 item: itemList) {
			subTotal += item.getItemTotal();
		}
		
		return subTotal;
	}
	
	public double getDiscountedSubTotal(char customer) {
		return getSubTotal() - getDiscount(customer);
	}


}
