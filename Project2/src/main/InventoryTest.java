//Void method test
package main;

public class Inventorytest {
public static void main (String args[]) {

Inventory.checkInv("Jalen");
Inventory.addItemToInv("stuff", "jalen");
//Inventory.RemoveInventory("stuff");
Inventory.checkInv("Jalen");
Inventory.ClearInventory();
Inventory.checkInv("Jalen");
}
}
/////////////////////////////////////////////////////
package main;

import static org.JUnit.Assert.*;

import org.junit.Test;
//JUNITTESTINVENTORY
public class TextgameTest {

/*@Test
public void testHasItem() {
	fail("Not yet implemented");
}*/
@Test
public void addtest() {
	Inventory junit = new Inventory();
	boolean result = junit.hasItem("stuff");
	assertEquals(false, result);
}
}
