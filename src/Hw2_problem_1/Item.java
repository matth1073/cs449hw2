package Hw2_problem_1;

public class Item {
	private String title;
	private double originalUnitPrice;
	private int quantity; 
	
	public Item(String title, double originalUnitPrice, int quantity) {
		setTitle(title);
		setOriginalUnitPrice(originalUnitPrice);
		setQuantity(quantity);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	
	public double getOriginalUnitPrice() {
		return originalUnitPrice; 
	}
	
	public void setOriginalUnitPrice(double originalUnitPrice) {
		this.originalUnitPrice = originalUnitPrice;
	}
	
	public int getQuantity() {
		return quantity; 
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getItemTotal() {
		return this.quantity * this.originalUnitPrice;
	}
}
