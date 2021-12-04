package classProject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
class InventoryTest {

	@Test
	static void testHasItem() {
		Inventory myUnit = new Inventory();
		boolean result = Inventory.hasItem("soda can");
		assertEquals(false, result);
		Inventory.addItemToInv("Soda Can");
		boolean newResult = Inventory.hasItem("Soda Can");
		assertEquals(true, newResult);
	}

}
