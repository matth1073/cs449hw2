package Hw2_Problem_5;

import java.util.ArrayList;



public class Sale5 {
private static double DISCOUNT_RATE = 0.05;
	
	private ArrayList<Item5> itemList = new ArrayList<Item5>();
	
	public void addItem(Item5 item) {
		itemList.add(item);
	}
	public double getDiscountRate(){
			return DISCOUNT_RATE; 
	}
	public double getDiscount(){
		return getSubTotal()*getDiscountRate();
	}
	
	public double getSubTotal() {
		double subTotal = 0.0;
		for (Item5 item: itemList) {
			subTotal += item.getItemTotal();
		}
		return subTotal;
	}
	
	public double getDiscountedSubTotal() {
		return getSubTotal() - getDiscount();
	}
}

class PreferredSale extends Sale5{
	private static double DISCOUNT_RATE = 0.15;
	
	public double getDiscountRate(){
		return DISCOUNT_RATE; 
	}
}

class TuesdaySeniorSale extends Sale5{
	private static double DISCOUNT_RATE = 0.10;
	
	public double getDiscountRate(){
		return DISCOUNT_RATE; 
	}
}

class NotTuesdaySeniorSale extends Sale5{
}
