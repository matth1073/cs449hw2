package Hw2_problem_1;


import junit.framework.TestCase;

public class Problem_1_Tests extends TestCase{ 
	private Sale sale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		sale = new Sale();
	}
	public void testAddItemSuccesfully() {
		Item orange = new Item("orange", 0.50, 5);
		sale.addItem(orange);
		assertNotNull(sale);
		assertNotNull(orange);
		assertEquals(orange.getItemTotal(), 2.5);
	
	}

	public void testGetDiscountSuccesfully() {
		Item orange = new Item("orange", 0.60, 5);
		sale.addItem(orange);
		Item banana = new Item("banana", 0.10, 10);
		sale.addItem(banana);
		Item apple = new Item("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getDiscount(), 0.5);
	}
	
	public void testGetSubTotalSuccesfully() {
		Item orange = new Item("orange", 0.60, 5);
		sale.addItem(orange);
		Item banana = new Item("banana", 0.10, 10);
		sale.addItem(banana);
		Item apple = new Item("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getSubTotal(), 10.0);
	}
	
	public void testGetDiscountedSubTotalSuccesfully() {
		Item orange = new Item("orange", 0.60, 5);
		sale.addItem(orange);
		Item banana = new Item("banana", 0.10, 10);
		sale.addItem(banana);
		Item apple = new Item("apple", 1.50, 4);
		sale.addItem(apple);
		
		assertEquals(sale.getDiscountedSubTotal(), 9.50);
	}
}
