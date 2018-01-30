package shoppingcart;

public class Item {

	private double price;
	private int quantity;
	private String itemName = "";

	public Item() {
		
	}

	public Item(String itemName, double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getItemName() {
		return itemName;
	}

	@Override
	public String toString() {
		return "[Item: " + itemName + "]\n" + "[Price: " + price + "]\n" + "[Quantity: " + quantity + "]";
	}
	
	
}
