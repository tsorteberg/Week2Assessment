package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GraphicCard;
import model.GraphicCardLogic;
/**
 * TestGraphicCardLogic class file.
 * @author Tom Sorteberg
 * Assessment for CIS-175 Week 2.
 */
public class TestGraphicCardLogic {
	// Global object declaration and instantiation.
	GraphicCardLogic gcLogic = new GraphicCardLogic();
	GraphicCard graphicCard = new GraphicCard("AMD Radeon RX 6800");

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tests the fixPrice method from the GraphicCardLogic class.
	 * The test passes if the method returns the expected value.
	 */
	@Test
	public void testFixPriceNoChange() {
		graphicCard.setPrice(649.00);
		graphicCard.setQuantity(5);
		double fixedPrice = gcLogic.fixPrice(graphicCard);
		assertEquals(649.00, fixedPrice, 0.0);
	}
	
	/**
	 * Tests the fixPrice method from the GraphicCardLogic class.
	 * The test passes if the method returns the expected value.
	 */
	@Test
	public void testFixPriceChange() {
		graphicCard.setPrice(649.00);
		graphicCard.setQuantity(3);
		double fixedPrice = gcLogic.fixPrice(graphicCard);
		assertEquals(1298.00, fixedPrice, 0.0);
	}
	
	/**
	 * Tests the inStock method from the GraphicCardLogic class.
	 * The test passes if the method returns true.
	 */
	@Test
	public void testInStockTrue() 
	{
		graphicCard.setQuantity(5);
		assertTrue(gcLogic.inStock(graphicCard));
	}
	
	/**
	 * Tests the inStock method from the GraphicCardLogic class.
	 * The test passes if the method returns false.
	 */
	@Test
	public void testInStockFalse() 
	{
		graphicCard.setQuantity(0);
		assertFalse(gcLogic.inStock(graphicCard));
	}
	

}
