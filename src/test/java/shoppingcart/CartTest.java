package shoppingcart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CartTest {
	
	@Test
	public void shouldhaveCartClass() {
		Cart underTest = new Cart();
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldAddOrder() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("", 0.0, 0));
		int orderSize = underTest.listSize();
		assertEquals(1, orderSize);
	}
	
	@Test
	public void shouldAddAnotherOrder() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("", 0.0, 0));
		underTest.addOrder(new Item("", 0.0, 0));
		int orderSize = underTest.listSize();
		assertEquals(2, orderSize);
	}
	
	@Test
	public void shouldTotalItemsIsOne() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 1));
		int check = underTest.getTotalItems();
		assertEquals(1, check);
	}
	
	@Test
	public void shouldTotalItemsIsTwo() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 2));
		int check = underTest.getTotalItems();
		assertEquals(2, check);
	}
	
	@Test
	public void shouldTotalItemsIsThree() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 1));
		underTest.addOrder(new Item("Toy", 0.0, 1));
		underTest.addOrder(new Item("Toy", 0.0, 1));
		int check = underTest.getTotalItems();
		assertEquals(3, check);
	}
	
	@Test 
	public void shouldCalculatePriceItemOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 1));
		double check = underTest.totalPricePerItemType();
		assertEquals(1.5, check, .001);
	}
	
	@Test 
	public void shouldCalculatePriceTwoItemsOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		double check = underTest.totalPricePerItemType();
		assertEquals(3.0, check, .001);
	}
	
	@Test 
	public void shouldCalculatePriceThreeItemsOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		double check = underTest.totalPricePerItemType();
		assertEquals(9.0, check, .001);
	}
	
	@Test 
	public void shouldCalculatePriceThreeItemsOrderedWithDifferentPrices() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 3.0, 6));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		double check = underTest.totalPricePerItemType();
		assertEquals(24.0, check, .001);
	}
	
	@Test
	public void shouldRemoveItem() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Box", 2.0, 3));
		underTest.removeOrderByItemIndex(1);
		int orderSize = underTest.listSize();
		assertEquals(1, orderSize);
	}
	
	@Test
	public void shouldRemoveItemByIndexTwo() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Box", 2.0, 3));
		underTest.addOrder(new Item("Box", 2.0, 3));
		underTest.addOrder(new Item("Box", 2.0, 3));
		underTest.removeOrderByItemIndex(2);
		int orderSize = underTest.listSize();
		assertEquals(3, orderSize);
	}
	
	@Test
	public void shouldRemoveItemByType() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Box", 2.0, 3));
		underTest.addOrder(new Item("Trinket", 2.0, 3));
		underTest.addOrder(new Item("Shirt", 2.0, 3));
		underTest.addOrder(new Item("Shirt", 2.0, 3));
		underTest.removeOrderByItemName("Shirt");
		int orderSize = underTest.listSize();
		assertEquals(3, orderSize);
	}
	//at some point we need to calculate cart price. That would be something like
	
}