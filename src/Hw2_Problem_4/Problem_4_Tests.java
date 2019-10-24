package Hw2_Problem_4;

import junit.framework.TestCase;

public class Problem_4_Tests extends TestCase {
	private PreferredSale preferredSale; 
	private TuesdaySeniorSale tuesdaySeniorSale; 
	private NotTuesdaySeniorSale notTuesdaySeniorSale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		preferredSale = new PreferredSale();
		tuesdaySeniorSale = new TuesdaySeniorSale();
		notTuesdaySeniorSale = new NotTuesdaySeniorSale(); 
	}
	
	public void  testPreferredSaleSuccesfully() {
		Item4 orange = new Item4("orange", 0.60, 5);
		preferredSale.addItem(orange);
		Item4 banana = new Item4("banana", 0.10, 10);
		preferredSale.addItem(banana);
		Item4 apple = new Item4("apple", 1.50, 4);
		preferredSale.addItem(apple);
		
		assertEquals(preferredSale.getSubTotal(), 10.00);
		assertEquals(preferredSale.getDiscountRate(), 0.15);
		assertEquals(preferredSale.getDiscount(), 1.50);
		assertEquals(preferredSale.getDiscountedSubTotal(), 8.50);
	}
	
	public void testTuesdaySeniorSaleSuccesfully() {
		Item4 orange = new Item4("orange", 0.60, 5);
		tuesdaySeniorSale.addItem(orange);
		Item4 banana = new Item4("banana", 0.10, 10);
		tuesdaySeniorSale.addItem(banana);
		Item4 apple = new Item4("apple", 1.50, 4);
		tuesdaySeniorSale.addItem(apple);
		
		assertEquals(tuesdaySeniorSale.getSubTotal(), 10.00);
		assertEquals(tuesdaySeniorSale.getDiscountRate(), 0.10);
		assertEquals(tuesdaySeniorSale.getDiscount(), 1.00);
		assertEquals(tuesdaySeniorSale.getDiscountedSubTotal(), 9.00);
	}
	
	public void testNotTuesdaySeniorSaleSuccesfully() {
		Item4 orange = new Item4("orange", 0.60, 5);
		notTuesdaySeniorSale.addItem(orange);
		Item4 banana = new Item4("banana", 0.10, 10);
		notTuesdaySeniorSale.addItem(banana);
		Item4 apple = new Item4("apple", 1.50, 4);
		notTuesdaySeniorSale.addItem(apple);
		
		assertEquals(notTuesdaySeniorSale.getSubTotal(), 10.00);
		assertEquals(notTuesdaySeniorSale.getDiscountRate(), 0.05);
		assertEquals(notTuesdaySeniorSale.getDiscount(), 0.50);
		assertEquals(notTuesdaySeniorSale.getDiscountedSubTotal(), 9.50);
	}
}
