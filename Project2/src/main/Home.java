
package classProject2;

public class Home {

	public int Home1(String NAME, String PLACE, String command, String[] inputs)
	{
		
		do {
		
		
		if (PLACE== "home") {
			System.out.println(NAME + " is at their home... It's a dump.");
			System.out.println("What does " + NAME + " wanna do?!");

			command= Textgame.checkInput(inputs);
			if (command.equals ("visit")) {
				Textgame.visit(PLACE );
			}
			if (command.equals ("help")) {
				Textgame.help();
			}
			if (command.equals ("check inventory")) {
				Inventory.checkInv();
			}
			if (command.equals( "look")) {
			
				System.out.println(NAME + " see's a book, a record player, a dirty plastic bowl, a cracked tv, several dead plants, and a desk. There is a library card on the desk.");
				
			}
			
			if (command.equals("use")) {
				System.out.println("What are you gonna use " + NAME + "?");
			}
				

				if (!(Inventory.hasItem("libraryPass"))) {
					String[] houseObjects = {"book","recordPlayer","plasticBowl","tv","deadPlant","libraryCard","cavePassage"};
					command= Textgame.checkInput(houseObjects);
					
					  if (command.equals("book") ){
							System.out.println(NAME + " picks up the book and opens it... Chapters 4-8 fall out of the book :/");
						} 
					   if (command.equals ("recordPlayer")) {
							System.out.println(NAME + " presses play on the record player and is rick rolled.");
						}
					   if (command.equals ("plasticBowl")) {
							System.out.println(NAME + " picks up the plastic bowl and then sets it back down.");
						} 
					  if (command .equals ("tv")) {
							System.out.println(NAME + " turns on the tv and Spongebob appears on the screen!");
						} 
					   if (command .equals( "deadPlant")) {
							System.out.println(NAME + " smells the dead plant... Why " + NAME + " is doing this I have no clue");
						} 
					   if (command .equals ("libraryCard")) {
							if (!(Inventory.hasItem("library card"))) {
								System.out.println(NAME + " has picked up the library card.");
								Inventory.addItemToInv("libraryPass");
							}
						}
					
					   if (command.equals("cavePassage")) {
						   PLACE= "cave";
							Cave cav = new Cave();
							cav.cave(NAME,  PLACE,  command, inputs);

					}
					
					
					
					
					
					
					
					
				} 
				
				
				 if (Inventory.hasItem("libraryPass")) {
					String[] houseObjects =  {"book","recordPlayer","plasticBowl","tv","deadPlant","libraryCard","cavePassage"};
					command= Textgame.checkInput(houseObjects);
				}
	
				
				
				
			//}
				
				
				
				
				
				
				
				
				
				
				if (command.equals("cavePassage")) {
					PLACE= "cave";
					Cave cav = new Cave();
					cav.cave(NAME,  PLACE,  command, inputs);

				

			}
		}
	}while(!command .equals ("cavePassage"));
		
	return 1;

	}
}
