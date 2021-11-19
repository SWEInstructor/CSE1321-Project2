package classProject2;

public class TownSquare {
	
	public int townSquare(String NAME, String place, String command, String[] inputs)
	{
		if (place.equals("townSquare")){
			System.out.println("You walk into the town square and see a farmer's stand and a flower stall.");
			while(!command.equals("visit") || !command.equals("use")){
			System.out.println("So, what are you doing now?: ");

			command = Textgame.checkInput(inputs);

			if (command.equals("visit")){
				Textgame.visit(place);
			}

			if (command.equals("help")) {
				Textgame.help();
			}

			if (command.equals("look"))  {
				System.out.println("Oh yeah, you can see your friend's house from here.");
				System.out.println("But I already said, there's a flower stall and a farmer's stand here!");
			}

			if (command.equals("use"))   {
				String action1;
				System.out.println("Which one would you like to go to?: ");
				String[] squareOptions = {"farmer's stand", "flower stall", "friend's house"};
				action1 = Textgame.checkInput(squareOptions);
				if (action1 == "farmer's stand")
				{
					System.out.println("You see the fruits and veggies the stand has but you're too broke to afford any of it.");
				} else if (action1 == "flower stall") {
					System.out.println("You look at all the different flowers at the stand. " + NAME + " should probably get their mom some flowers if they ever find the treasure.");
				} else if (action1 == "friend's house") {
					place = "friendsHouse";
				}
		      	}

		      	if (command == "check inventory")   {
				Inventory.checkInv();
	    		}
			}
	    	}
	return 1;
	}}