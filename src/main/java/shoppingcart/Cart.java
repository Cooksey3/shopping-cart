package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> orders = new ArrayList<>();
	
	public void addOrder(Item theItem) {
		orders.add(theItem);
	}

	public int listSize() {
		return orders.size();
	}

	public int getTotalItems() {
		int items = 0;
		for(Item order : orders) {
			items += order.getQuantity();
		}
		return items;
	}

	//Currently this adds up the total number of items and then multiplies them by the various prices added together
	public double totalPricePerItemType() {
		double totalPrice  = 0.0;
		for(Item order : orders) {
			totalPrice += order.getQuantity() * order.getPrice();
		}
		return totalPrice;
	}
	
	
	
}
