package main;

public class Home {
	
	public Home(String NAME, String place, String command, String[] inputs)
	{
		if (place== "Home") {
			System.out.println(NAME + " is at their home... It's a dump.");
			System.out.println("What does " + NAME + " wanna do?!");

			command= TextGame.checkInput(inputs);
			if (command== "visit") {
				TextGame.visit(place);
			}
			if (command== "help") {
				TextGame.help();
			}
			if (command== "check inventory") {
				Inventory.checkInv(NAME);
			}
			if (command== "look") {
				System.out.println(NAME + " see's a book, a record player, a dirty plastic bowl, a cracked tv, several dead plants, and a desk. There is a library card on the desk.");
			}
			if (command== "use") {
				System.out.println("What are you gonna use " + NAME + "?");

				if (!(Inventory.hasItem("libraryPass"))) {
					String[] houseObjects = {"book","record player","plastic bowl","tv","dead plant","library card","cave passage"};
					command= TextGame.checkInput(houseObjects);
				} else if (Inventory.hasItem("libraryPass")) {
					String[] houseObjects =  {"book","record player","plastic bowl","tv","dead plant","cave passage"};
					command= TextGame.checkInput(houseObjects);
				}

				if (command== "cave passage") {
					place= "cave";
				} else if (command== "book") {
					System.out.println(NAME + " picks up the book and opens it... Chapters 4-8 fall out of the book :/");
				} else if (command== "record player") {
					System.out.println(NAME + " presses play on the record player and is rick rolled.");
				} else if (command== "plastic bowl") {
					System.out.println(NAME + " picks up the plastic bowl and then sets it back down.");
				} else if (command== "tv") {
					System.out.println(NAME + " turns on the tv and Spongebob appears on the screen!");
				} else if (command== "dead plant") {
					System.out.println(NAME + " smells the dead plant... Why " + NAME + " is doing this I have no clue");
				} else if (command== "library card") {
					if (!(Inventory.hasItem("library card"))) {
						System.out.println(NAME + " has picked up the library card.");
						Inventory.addItemToInv("libraryPass", NAME);
					}
				}

			}
		}
	}
}
