package Hw2_Problem_3;

import junit.framework.TestCase;

public class Problem_3_Tests extends TestCase{
	private Sale3 sale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		sale = new Sale3();
	}

	public void testSeniorCustomerDiscountOnTuesdaySuccesfully() {
		Item3 orange = new Item3("orange", 0.60, 5);
		sale.addItem(orange);
		Item3 banana = new Item3("banana", 0.10, 10);
		sale.addItem(banana);
		Item3 apple = new Item3("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.00);
		assertEquals(sale.getDiscountRate('s', "tuesday"), 0.10);
		assertEquals(sale.getDiscount('s', "tuesday"), 1.00);
		assertEquals(sale.getDiscountedSubTotal('s', "tuesday"), 9.00);
	}
	
	public void testSeniorCustomerDiscountOnOtherDaySuccesfully() {
		Item3 orange = new Item3("orange", 0.60, 5);
		sale.addItem(orange);
		Item3 banana = new Item3("banana", 0.10, 10);
		sale.addItem(banana);
		Item3 apple = new Item3("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.00);
		assertEquals(sale.getDiscountRate('s', "monday"), 0.05);
		assertEquals(sale.getDiscount('s', "monday"), 0.50);
		assertEquals(sale.getDiscountedSubTotal('s', "monday"), 9.50);
		assertEquals(sale.getDiscountedSubTotal('s', "wednesday"), 9.50);
		assertEquals(sale.getDiscountedSubTotal('s', "thursday"), 9.50);
		assertEquals(sale.getDiscountedSubTotal('s', "friday"), 9.50);
		assertEquals(sale.getDiscountedSubTotal('s', "saturday"), 9.50);
		assertEquals(sale.getDiscountedSubTotal('s', "sunday"), 9.50);
	}
	
}
