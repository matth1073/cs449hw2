package Hw2_Problem_2;

import junit.framework.TestCase;

public class Problem_2_Tests extends TestCase{
	private Sale2 sale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		sale = new Sale2();
	}

	public void testRegularCustomerDiscountSuccesfully() {
		Item2 orange = new Item2("orange", 0.60, 5);
		sale.addItem(orange);
		Item2 banana = new Item2("banana", 0.10, 10);
		sale.addItem(banana);
		Item2 apple = new Item2("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.00);
		assertEquals(sale.getDiscountRate('r'), 0.05);
		assertEquals(sale.getDiscount('r'), 0.50);
		assertEquals(sale.getDiscountedSubTotal('r'), 9.50);
		
	}
	
	public void testSeniorCustomerDiscountSuccesfully() {
		Item2 orange = new Item2("orange", 0.60, 5);
		sale.addItem(orange);
		Item2 banana = new Item2("banana", 0.10, 10);
		sale.addItem(banana);
		Item2 apple = new Item2("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.00);
		assertEquals(sale.getDiscountRate('s'), 0.10);
		assertEquals(sale.getDiscount('s'), 1.00);
		assertEquals(sale.getDiscountedSubTotal('s'), 9.00);
	}
	
	public void testPreferredCustomerDiscountSuccesfully() {
		Item2 orange = new Item2("orange", 0.60, 5);
		sale.addItem(orange);
		Item2 banana = new Item2("banana", 0.10, 10);
		sale.addItem(banana);
		Item2 apple = new Item2("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.00);
		assertEquals(sale.getDiscountRate('p'), 0.15);
		assertEquals(sale.getDiscount('p'), 1.50);
		assertEquals(sale.getDiscountedSubTotal('p'), 8.50);
	}
	
	public void testdelete() {
		
	}
	
	
}
