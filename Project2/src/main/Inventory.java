package classProject2;

import java.util.ArrayList;

public class Inventory {
public static ArrayList<String> inventory = new ArrayList<String>();
	
	public static int checkInv(){
		
		Textgame.getName();
		System.out.print(" has ");
		if (inventory.size() <= 1) {
			if (inventory.size() == 1) {
				System.out.println(inventory.get(0) + ".");
			}
			else {
				System.out.println("nothing...");
			}
		}
		else {
			for(int i = 0; i < inventory.size()-2; i++) {
				System.out.print(inventory.get(i) + ", ");
			}
			System.out.print(inventory.get(inventory.size() - 2) + " and " + 
			inventory.get(inventory.size() - 1));
		}
	return 1;
	}
	
	public static int addItemToInv(String item){
		 Textgame.getName();
		
		
		if(hasItem(item));
		else {
			inventory.add(item);
			System.out.println(item + " has been added to " ); 
			Textgame.getName();
					
			System.out.println	(	 "'s inventory.");
		}
	return 1;
	}
	
	public static boolean hasItem(String item){
		for (int i = 0; i < inventory.size(); i++) {
			if (item.equals(inventory.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public static int RemoveInventory(String item){
		inventory.remove(item);
		return 1;
	}
	public static int ClearInventory() {
		inventory.removeAll(inventory);
		return 1;
	}
}
