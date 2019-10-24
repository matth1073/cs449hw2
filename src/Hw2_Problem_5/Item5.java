package Hw2_Problem_5;

public class Item5 {
	private String title;
	private double originalUnitPrice;
	private int quantity; 
	private boolean bogo; 
	
	public Item5(String title, double originalUnitPrice, int quantity, String isBogo) {
		setTitle(title);
		setOriginalUnitPrice(originalUnitPrice);
		setQuantity(quantity);
		setBogo(isBogo);
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
		if (!getBogo()) {
			return this.quantity * this.originalUnitPrice;
		}
		return (this.quantity - 1) * this.originalUnitPrice * 0.50 + this.originalUnitPrice;
	}
	
	public void setBogo(String isBogo) {
		if (isBogo.toLowerCase() == "bogo" || isBogo.toLowerCase() == "yes") {
			bogo = true; 
		}
		else {
			bogo = false;
		}
	}
	
	public boolean getBogo() {
		return bogo;
	}

}
