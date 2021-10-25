package main;

import java.util.ArrayList;

public class Home {
	
	private static String[] inputs = TextGame.inputs;
	
	public static void Home(String NAME)
	{	
		System.out.println(NAME + " is at their home... It's a dump.");
		Home1(NAME);
	}
	
	private static void Home1(String NAME) {
		System.out.println("What does " + NAME + " wanna do?!");
		
		switch (checkInput(inputs)) {
		
			case "use":
				Home2(NAME);
				break;
			case "look":
				System.out.println(NAME + "see’s a book, a record player, a dirty plastic bowl, a"
						+ " cracked tv, several dead plants, and a desk. There is a Library card"
						+ "on the desk");
				break;
			case "visit":
				TextGame.visit();
				break;
			case "check inventory":
				Inventory.checkInv();
				break;
			case "help":
				TextGame.help();
				break;
			default:
				System.out.println("This was not supposed to happen, sorry!");
				TextGame.help();
				break;
		}
	}
	
	private static void Home2(String NAME) {
		ArrayList<String> houseObjects = ["Book", "Record Player", "Plastic Bowl", "TV",
		                                  "Dead Plant", "Cave Passage"];
		System.out.println("What are you gonna use" + NAME +"?");
		if (!Inventory.hasItem("libraryPass")) {
			houseObjects.add("Library Card");
		}
		else {
			houseObjects.remove("Library Card");
		}
		
		switch (checkInput(houseObjects)) {
			case "Book":
				System.out.println(NAME + " picks up the book and opens it....chapters 4-8 fall out of the book. :/ ");
				break;
				
			case "Record Player":
				System.out.println(NAME + " presses play on the record player and is rick rolled.");
				break;
				
			case "Plastic Bowl":
				System.out.println(NAME + " picks up the plastic bowl and then sets it back down.");
				break;
				
			case "TV":
				System.out.println(NAME + " turns on the TV and spongebob appears on the screen!");
				break;
				
			case "Dead Plant":
				System.out.println(NAME + "smells the dead plant....why " + NAME + " is doing this I have no clue ¯\_(ツ)_/¯");
				break;
				
			case "Cave Passage":
				Cave();
				break;
				
			case "Library Card":
				System.out.println(NAME + " has picked up the library card.");
				addItemToInv("libraryPass", NAME);
				break;
			default:
				System.out.println("This should not happen");
		}
		Home1(NAME);
	}
	
}
