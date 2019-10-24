package Hw2_Problem_5;

import junit.framework.TestCase;  

public class Problem_5_Tests extends TestCase{
	private Sale5 sale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		sale = new Sale5();
	}
	public void testBogoItemSuccesfully() {
		Item5 orange = new Item5("orange", 0.50, 5, "bogo");
		sale.addItem(orange);
		assertEquals(orange.getItemTotal(), 1.50);
		
		Item5 pears = new Item5("pears", 0.50, 5, "noBogo");
		sale.addItem(pears);
		assertEquals(pears.getItemTotal(), 2.50);
		
		Item5 banana = new Item5("banana", 0.10, 1, "bogo");
		sale.addItem(banana);
		assertEquals(banana.getItemTotal(), 0.10);
	}

}
