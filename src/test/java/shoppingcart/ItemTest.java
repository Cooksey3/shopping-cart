package shoppingcart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ItemTest {

	@Test
	public void shouldCreateItemClass() {
		Item underTest = new Item();
		assertNotNull(underTest);
	}

	@Test
	public void shouldInstantiateAnItemWithPriceAndNumberOfItems() {
		Item underTest = new Item("", 0.0, 0);
		assertNotNull(underTest);

	}

	@Test
	public void shouldIncreasePrice() {
		Item underTest = new Item("", 1.1, 0);
		double price = underTest.getPrice();
		assertEquals(1.1, price, .001);
	}

	@Test
	public void shouldIncreasePriceAgain() {
		Item underTest = new Item("", 1.2, 0);
		double price = underTest.getPrice();
		assertEquals(1.2, price, .001);
	}

	@Test
	public void shouldIncreaseQuantity() {
		Item underTest = new Item("", 0, 1);
		int quantity = underTest.getQuantity();
		assertEquals(1, quantity);
	}

	@Test
	public void shouldIncreaseQuantityAgain() {
		Item underTest = new Item("", 0, 2);
		int quantity = underTest.getQuantity();
		assertEquals(2, quantity);
	}

	@Test
	public void shouldHaveItemName() {
		Item underTest = new Item("Toy", 0, 0);
		String itemName = underTest.getItemName();
		assertEquals("Toy", itemName);
	}

	@Test
	public void shouldHaveAnotherItemName() {
		Item underTest = new Item("Box", 0, 0);
		String itemName = underTest.getItemName();
		assertEquals("Box", itemName);
	}
	
	@Test
	public void shouldHaveOverriddenToString() {
		Item underTest = new Item("Box", 1.1, 1);
		String toString = underTest.toString();
		assertEquals("[Item: Box]\n[Price: 1.1]\n[Quantity: 1]", toString);
	}
}
