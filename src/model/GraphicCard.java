package model;
/**
 * GraphicCard class file.
 * @author Tom Sorteberg
 * Assessment for CIS-175 Week 2.
 */
public class GraphicCard {
	// Instance variable declaration and initialization.
	private String modelName;
	private double price;
	private int quantity;
	
	/**
	 * Default constructor.
	 */
	public GraphicCard() {
	}
	
	/**
	 * Primary constructor.
	 * @param modelName: Required string.
	 */
	public GraphicCard(String modelName) {
		super();
		this.modelName = modelName;
	}

	/**
	 * Get method for the modelName instance.
	 * @return: Returns a string.
	 */
	public String getModelName() {
		return modelName;
	}
	
	/**
	 * Get method for the price instance.
	 * @return: Returns a double.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Get method for the quantity instance.
	 * @return: Returns an integer.
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Set method for the modelName instance.
	 * @param modelName: Required string.
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	/**
	 * Set method for the price instance.
	 * @param price: Required double.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Set method for the quantity instance.
	 * @param quantity: Required integer.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
