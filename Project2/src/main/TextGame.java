
import java.util.Scanner;

public class Textgame {
	public static String[] inputs = {"use","look","visit","inventory","help"};
	private static String NAME = "";
	//public static String PLACE ;

	
	public static void help() {
		System.out.println("There are four main commands in this game: ");
		System.out.println("Help - provides a list of game commands. ");
		System.out.println("Visit - allows you to travel bewteen the three main areas in the adventure game. Type visit, and hit enter. You'll then be prompted with a list of locations to travel to");
		System.out.println("Use - allows you to use the items you've gathered thus far. If you use an item in the world, you will pick it up. If you interact with certain world objects, you will be asked which item you want to use");
		System.out.println("Check Inventory - Allows you to see what items you've gathered");
		System.out.println("Look - Allows you to look around your area for items that you can interact with");
	}
	
	public static String checkInput(String[] inputs) {
		Scanner sc = new Scanner(System.in);
		boolean isWrong = true;
		String command = "";
		do {
			System.out.println("Your choices are as follows:");
			for(int i = 0; i<inputs.length; i++) {	
				System.out.print(inputs[i]+", ");
			}
			System.out.println();
			System.out.print("Please enter an option: ");
			command = sc.next();
			for(int i = 0;i<inputs.length;i++) {
				
				String current = inputs[i];
				if(command.equals(current)) {
					isWrong = false;
				}
			}
		} while(isWrong);
		return command;
	}
	
	static String[] visitInput = { "libraryEntrance" ,"townSquare", "libraryFrontSection","libraryBackSection", "home", "friendsHouse"};

//public static String PLACE= "";


	public static  String visit(String place) {
	
		
		String command ="";
		System.out.print("Where does "+NAME+" want to go today I wonder? ");
		///
		
		
		//visitInput = { "libraryEntrance" ,"townSquare", "libraryFrontSection","libraryBackSection", "home"};
//PLACE =  visitInput;
		 PLACE =checkInput(visitInput);
			
		//command = checkInput(visitInput);
		
/*
		if (PLACE .equals ("home")) {
			 //PLACE =command ;
			//System.out.println(" Place is " + PLACE);

			place = "home";
			Home house = new Home();
			house.Home1(NAME,  place,  command, inputs);
			//String PLACE= visitInput[4];

			

		}
		
		if (PLACE .equals ("Cave")) {
			 //PLACE =command ;
			//System.out.println(" Place is " + PLACE);

			place = "cave";
			Cave cav = new Cave();
			cav.cave(NAME,  place,  command, inputs);
			//String PLACE= visitInput[4];

			

		}
		
		else if (PLACE .equals ("libraryEntrance")) {
			
			
			place = "libraryEntrance";
			Library lib = new Library();
			lib.libraryEntrance(NAME,  place,  command, inputs);
			//lib.L(NAME,  place,  command, inputs);
			//place = "libraryEntrance";
			
		}
	else if (PLACE .equals ("libraryFront")) {
			
			
			place = "libraryFront";
			Library lib2 = new Library();
			lib2.libraryFront(NAME);
			//lib.L(NAME,  place,  command, inputs);
			//place = "libraryEntrance";
			
		}
		
	else if (PLACE .equals ("libraryBackSection")) {
		
		
		place = "libraryBack";
		Library lib3 = new Library();
		lib3.libraryBack(NAME);
		//lib.L(NAME,  place,  command, inputs);
		//place = "libraryEntrance";
		
	}
		
else if (PLACE .equals ("townSquare")) {
		
		
		place = "townSquare";
		TownSquare town = new TownSquare();
		town.townSquare(NAME,  place,  command, inputs);
		//lib.L(NAME,  place,  command, inputs);
		//place = "libraryEntrance";
		
	}
		
else if (PLACE .equals ("friendsHouse")) {
	
	
	place = "friendsHouse";
	FriendsHouse friend = new FriendsHouse();
	friend.HouseMain(NAME,  inputs);
	//lib.L(NAME,  place,  command, inputs);
	//place = "libraryEntrance";
	
}
	*/	
		switch (PLACE) {
		
		case "libraryFrontSection" : 
			System.out.println(NAME+" decides that apparently they are super human, and attempts to walk through the wall, "+
					"only to realize that they have nto spontaneously become able to do such a thing. They should really try to use the PASSAGE "+
					"that they used to get in here in the first place.");
			place = "libraryFront";
			Library lib2 = new Library();
			lib2.libraryFront(NAME);
			//lib.L(NAME,  place,  command, inputs);
			//place = "libraryEntrance";
			break;
			
		case "libraryBackSection" : 
			System.out.println(NAME+" decides that apparently they are super human, and attempts to walk through the wall, "+
					"only to realize that they have nto spontaneously become able to do such a thing. They should really try to use the PASSAGE "+
					"that they used to get in here in the first place.");
			
			place = "libraryBack";
			Library lib3 = new Library();
			lib3.libraryBack(NAME);
			//lib.L(NAME,  place,  command, inputs);
			//place = "libraryEntrance";
			break;
			
			
			
		case "friendsHouse" : 
		/*	System.out.println(NAME+" decides that apparently they are super human, and attempts to walk through the wall, "+
					"only to realize that they have nto spontaneously become able to do such a thing. They should really try to use the PASSAGE "+
					"that they used to get in here in the first place.");*/
			
			place = "friendsHouse";
			FriendsHouse friend = new FriendsHouse();
			friend.HouseMain(NAME,  inputs);
			//lib.L(NAME,  place,  command, inputs);
			//place = "libraryEntrance";
			break;			
		case "home": System.out.println(NAME+" has decided to take a trip back to their home, probably to give up their useless and incredibly stupid adventure.");
		 //PLACE =command ;
		//System.out.println(" Place is " + PLACE);

		place = "home";
		Home house = new Home();
		house.Home1(NAME,  place,  command, inputs);
		//String PLACE= visitInput[4];
		
		break;
		case "libraryEntrance": System.out.println(NAME+" has decided to take a trip down to the library, Probably because they've realized that they have no idea what they're supposed to be doing.");
		place = "library";
		
		
		place = "libraryEntrance";
		Library lib = new Library();
		lib.libraryEntrance(NAME,  place,  command, inputs);
		//lib.L(NAME,  place,  command, inputs);
		//place = "libraryEntrance";

		break;	
			
		case "townSquare" :  System.out.println(NAME+" has decided to take a trip down to town Square, to see if they could find anything useful for their poor college student questing.");
		place = "townSquare";
		TownSquare town = new TownSquare();
		town.townSquare(NAME,  place,  command, inputs);
		//lib.L(NAME,  place,  command, inputs);
		//place = "libraryEntrance";
		break;
	
		
		
		case "Cave" : 
			 //PLACE =command ;
			//System.out.println(" Place is " + PLACE);

			place = "cave";
			Cave cav = new Cave();
			cav.cave(NAME,  place,  command, inputs);
			//String PLACE= visitInput[4];

		break;
		
		default:System.out.println( "What are you doing bro?, pick a real option...");
		}
		return command;
		
		
		
		
		
		
		
		
		/*
		
		if(place.equals("libraryFrontSection") || place.equals("libraryBackSection") || place.equals("friendsHouse")) {
			System.out.println(NAME+" decides that apparently they are super human, and attempts to walk through the wall, "+
					"only to realize that they have nto spontaneously become able to do such a thing. They should really try to use the PASSAGE "+
					"that they used to get in here in the first place.");
			return place;
		} else if(command.equals("home")) {
			System.out.println(NAME+" has decided to take a trip back to their home, probably to give up their useless and incredibly stupid adventure.");
			return "home";
		} else if(command.equals("townSquare")) {
			System.out.println(NAME+" has decided to take a trip down to town Square, to see if they could find anything useful for their poor college student questing.");
			return "townSquare";
		} else {
			System.out.println(NAME+" has decided to take a trip down to the library, Probably because they've realized that they have no idea what they're supposed to be doing.");
			Library lib = new Library();
			lib.libraryEntrance(NAME, place);
			place = "libraryEntrance";
			System.out.print(lib);
			return "libraryEntrance";
			
			
		}*/


	}
	
	

	public static String PLACE= "";

	
	
	
public static void main (String args[]) {
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome to \"THE COLLEGE EXPERIENCE\" created by Hon CSE 1321 in the fall of 2021");
	String[] inputs = {"use","look","visit","inventory","help"};
	String command = "";
	boolean play = false;
	System.out.println("This game works by special commands.");
	//lists the commands using the help method
	help();
	System.out.println("Game comencing in three, two, one...");
	do {
		System.out.println("We begin out story by taking a look at a specific college student, down "+
				"on his luck, doing some brain storming on what to do about the money problem of college life");
		System.out.print("What would this college students name be?: ");
		NAME = sc.next();
		System.out.println("Inspiration strikes!! as the college student named "+NAME+" decided to do! What did the college student do? ");
		command = checkInput(inputs);
		
		
		
		
		
		
		
		if(command.equals("visit")) {
		
			visit(PLACE );
			
			
		}
		
		
		
		
		
		
		
		
		
		
		if(command.equals("help")) {
			help();
		}
		
		
		if(command.equals("inventory")) {
			
			
			Inventory.checkInv();
		}
		String gameplay="";
		String[] options ;
		System.out.print("Do you want to control the life of a college student user again? Enter Y for yes and N for no.");
		String gamePlay = sc.next();
		if (gamePlay.equalsIgnoreCase("Y")) {
			play = true;
		} else if(gameplay.equalsIgnoreCase("N")) {
			play = false;
		}
		
	} while(play == true);
	System.out.println("GAME OVER");

}

public static String getName() {
	// TODO Auto-generated method stub
	System.out.print(NAME);
	return NAME;
}
	
	
}

