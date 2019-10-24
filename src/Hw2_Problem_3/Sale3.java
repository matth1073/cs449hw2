package Hw2_Problem_3;

import java.util.ArrayList;


public class Sale3 {
	private static double DISCOUNT_RATE = 0.05;
	private static double SENIOR_DISCOUNT_RATE = 0.10;
	private static double PREFERRED_DISCOUNT_RATE = 0.15;
	
	private ArrayList<Item3> itemList = new ArrayList<Item3>();
	
	public void addItem(Item3 item) {
		itemList.add(item);
	}
	public double getDiscountRate(char customer, String day){
		char customerType = Character.toLowerCase(customer);
		String dayOfTheWeek = day.toLowerCase();
		switch (customerType) {
		case 'r':
			return DISCOUNT_RATE;
		case 's':
			switch (dayOfTheWeek) {
			case "tuesday":
				return SENIOR_DISCOUNT_RATE;
			default:
				return DISCOUNT_RATE; 
			}
		case 'p':
			return PREFERRED_DISCOUNT_RATE;
		default:
			return DISCOUNT_RATE; 
		}
	}
	public double getDiscount(char customer, String day){
		return getSubTotal()*getDiscountRate(customer, day);
	}
	
	public double getSubTotal() {
		double subTotal = 0.0;
		for (Item3 item: itemList) {
			subTotal += item.getItemTotal();
		}
		
		return subTotal;
	}
	
	public double getDiscountedSubTotal(char customer, String day) {
		return getSubTotal() - getDiscount(customer, day);
	}


}
