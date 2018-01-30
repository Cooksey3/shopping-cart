package shoppingcart;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CartTest {
	
	@Test
	public void shouldhaveCartClass() {
		Cart underTest = new Cart();
		assertNotNull(underTest);
	}
	
	
	
	
}
