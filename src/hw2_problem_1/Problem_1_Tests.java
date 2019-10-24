package hw2_problem_1;


import junit.framework.TestCase;

public class problem_1_Tests extends TestCase{ 
	private Sale sale; 
	
	protected void setUp() throws Exception {
		super.setUp();
		sale = new Sale();
	}
	
	public void quicktest() {
		System.out.println("Ok");
		Item orange = new Item("orange", 0.50, 5);
		sale.addItem(orange);
		assertNotNull(sale);
		
	}
}
