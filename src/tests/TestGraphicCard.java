package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GraphicCard;
/**
 * TestGraphicCard class file.
 * @author Tom Sorteberg
 * Assessment for CIS-175 Week 2.
 */
public class TestGraphicCard {

	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * Tests the default constructor of the GraphicCard class.
	 * The test passes if the object is not null.
	 */
	@Test
	public void testGrapicCardNameIsNull() {
		GraphicCard graphicCard = new GraphicCard();
		assertNull(graphicCard.getModelName());
	}
	
	/**
	 * Tests the primary constructor of the GraphicCard class.
	 * The test passes if the object is not null.
	 */
	@Test
	public void testGrapicCardNameIsNotNull() {
		GraphicCard graphicCard = new GraphicCard("AMD Radeon RX 6800");
		assertNotNull(graphicCard.getModelName());
	}
	
}
