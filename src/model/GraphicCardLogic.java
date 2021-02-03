package model;
/**
 * GraphicCardLogic class file.
 * @author Tom Sorteberg
 * Assessment for CIS-175 Week 2.
 */
public class GraphicCardLogic {
	
	// Constant declaration and initialization.
	final int threshold = 5;
	final double markUp = 1.00;
	
	/**
	 * Default constructor.
	 */
	public GraphicCardLogic() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method that calculates price of unit based on inventory.
	 * @param graphicCard: Required GraphicCard object.
	 * @return: Returns a double.
	 */
	public double fixPrice(GraphicCard graphicCard) 
	{
		// Return variable declaration and initialization.
		double fixedPrice = graphicCard.getPrice();
				
		// Selection logic to determine price based on inventory.
		if (graphicCard.getQuantity() < this.threshold) 
		{
			fixedPrice += (fixedPrice * this.markUp);
		}
		// Return statement.
		return fixedPrice;
	}
	
	/**
	 * Method that determines if graphic card is in stock.
	 * @param graphicCard: Required GraphicCard object.
	 * @return: Returns a boolean.
	 */
	public boolean inStock(GraphicCard graphicCard) 
	{
		// Return variable declaration and initialization.
		boolean stocked = true;
		
		// Selection logic to determine if card is in stocke.
		if (graphicCard.getQuantity() == 0) 
		{
			stocked = false;
		}
		
		// Return statement.
		return stocked;
	}
	
}
