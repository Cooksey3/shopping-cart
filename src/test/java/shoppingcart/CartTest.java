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
		assertEquals(1, underTest.listSize());
	}
	
	@Test
	public void shouldAnotherOrder() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("", 0.0, 0));
		underTest.addOrder(new Item("", 0.0, 0));
		int orderSize = underTest.listSize();
		assertEquals(2, underTest.listSize());
	}
	
	@Test
	public void shouldTotalItemsIsOne() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 1));
		int check = underTest.getTotalItems();
		assertEquals(1, underTest.getTotalItems());
	}
	
	@Test
	public void shouldTotalItemsIsTwo() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 2));
		int check = underTest.getTotalItems();
		assertEquals(2, underTest.getTotalItems());
	}
	
	@Test
	public void shouldTotalItemsIsThree() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 0.0, 1));
		underTest.addOrder(new Item("Toy", 0.0, 1));
		underTest.addOrder(new Item("Toy", 0.0, 1));
		int check = underTest.getTotalItems();
		assertEquals(3, underTest.getTotalItems());
	}
	
	@Test 
	public void shouldCalculatePriceItemOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 1));
		double check = underTest.totalPricePerItemType();
		assertEquals(1.5, underTest.totalPricePerItemType(), .001);
	}
	
	@Test 
	public void shouldCalculatePriceTwoItemsOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		double check = underTest.totalPricePerItemType();
		assertEquals(3.0, underTest.totalPricePerItemType(), .001);
	}
	
	@Test 
	public void shouldCalculatePriceThreeItemsOrdered() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		underTest.addOrder(new Item("Toy", 1.5, 2));
		double check = underTest.totalPricePerItemType();
		assertEquals(3.0, underTest.totalPricePerItemType(), .001);
	}
	
	//at some point we need to calculate cart price. That would be something like
	
}