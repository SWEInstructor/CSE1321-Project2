
package classProject2;

import java.util.Scanner;

public class Library {
	public int libraryEntrance(String NAME, String PLACE, String command, String[] inputs) {
		Scanner sc = new Scanner(System.in);
		String place = "";
		if (PLACE == "libraryEntrance") {
		System.out.println(NAME + " is at the library entrance right now");
		System.out.println(NAME + " was thinking of checking out the Library to see if any useful information will be there and if the library has any new comics! ");
		System.out.println("Narrator: " + NAME + " needs a Library Pass to enter the back section. " + NAME +" remembers what happened last time someone forgot it and they lost their pants!!");
		System.out.println( "What will " + NAME + " do next? Right now it seems like they're just going to stand there like a statue, apparently...\n");
		
		
		
		while(!command.equals("visit") || !command.equals("use")){
			System.out.println("So what are you doing while you're in here?: ");
			command = Textgame.checkInput(inputs);
			
		
			if(command.equals("visit")){
				Textgame.visit(place);
			} else if(command.equals("help")){
				Textgame.help();	
			} else if(command.equals("inventory")){
				Inventory.checkInv();	
			} else if(command.equals("look")){
				System.out.println(NAME + " looks around the library entrance and sees nothing of value...");
				System.out.println("Maybe "+NAME+" should go deeper into the library?");
			} else if(command.equals("use")){
				if(!(Inventory.hasItem("map"))){
					System.out.println( NAME + " sees nothing that they can use, perhaphs they should look elsewhere...");  
			}
		}}	
		//if(input.equals("libraryEntrance")) {
			//libraryFront(NAME);
		//}
	
	}
		return 1;
		}
	public int libraryFront (String NAME) {
		
		
		
		String command = " ";
		String place = "";
		String [] inputs = {"visit", "use", "look", "inventory", "help"};
		System.out.println(NAME + " walks into the library.");
		while(!command.equals("visit") || !command.equals("use")){
			System.out.println("So what are you doing while you're in here?: ");
			command = Textgame.checkInput(inputs);
			
		
			if(command.equals("visit")){
				Textgame.visit(place);
			} else if(command.equals("help")){
				Textgame.help();	
			} else if(command.equals("inventory")){
				Inventory.checkInv();	
			} else if(command.equals("look")){
				System.out.println(NAME + " looks around the library and sees no comics in sight.");
				System.out.println("Well, of course there aren't comic books. This is a library not Barnes & Noble.");
				System.out.println(NAME +" does spot the section that has lots of old books when they finally stop moping about the comics.");
				System.out.println("You should be able to use the books through the books for information about the treasure.");
			} else if(command.equals("use")){
				if(!(Inventory.hasItem("map"))){
					System.out.println( NAME + " starts skimming through the books because they can't be bothered to actually read and a piece of paper falls out of the last book they were holding.");  
					System.out.println("That was convenient. The paper is a very faded map that’s hard to read.");
					System.out.println("It looks like it might be a map of the cave, but I wouldn’t use that as my guide. You’d probably get lost or die or something.");
					System.out.println("That being said you do whatever floats your boat, I'm just the unfortunate narrator that has to deal with you...");
					Inventory.addItemToInv("map");
				} else if(Inventory.hasItem("map")){
					System.out.println(NAME + " starts skimming through the books yet again, because they can't be bothered to actually read.");
				}
			}
		}	
		
	return 1;
	}
	
	public int libraryBack(String NAME) {
        	String command = " ";
		String usecommand = " ";
		String place = " ";
        	String[] inputs = {"visit", "use", "look", "check inventory", "help"};
       		System.out.println(NAME + " made it to the back of the Library");
		while (!command.equals("visit") || !command.equals("use")) {
            		
            		System.out.println("What does " + NAME + " wanna do?!");
            		command = Textgame.checkInput(inputs);
            	
            		if (command.equals("visit")) {
                		Textgame.visit(place);
            		} else if (command.equals("help")) {
                		Textgame.help();
            		} else if (command.equals("inventory")) {
                		Inventory.checkInv();
            		} else if (command.equals("look")) {
                		System.out.println(NAME + "looks around and spots more books (it's like you're in library or something), a chair, and a map on a table.");
            		} else if (command.equals("use")) {
                		System.out.println("What is " + NAME + "going to use");
                		if (!(Inventory.hasItem("map"))) {
                    			String[] librarybackObjects = {"chair", "map", "books"};
                    			usecommand = Textgame.checkInput(librarybackObjects);
                		} else if (Inventory.hasItem("map")) {
                    			String[] librarybackObjects = {"chair", "books"};
                    			usecommand = Textgame.checkInput(librarybackObjects);
                		}
                    			
                    			
                    			if(usecommand.equals("chair")) {
                        			System.out.println(NAME + "sits down in the chair....lame");
                    			} 
                    			if (usecommand.equals("books")) {
                        			System.out.println(NAME + "opens a book, HOW EXCITING! (◔_◔)");
                    			}
                    			if (usecommand.equals("map")) {
                        			if (!(Inventory.hasItem("real map"))) {
                            				Inventory.addItemToInv("real map");
                        }
                    }
                //}
            } 
        }
		
		
		
		
		
		
		
		
		
		
    return 1;
	}
}

