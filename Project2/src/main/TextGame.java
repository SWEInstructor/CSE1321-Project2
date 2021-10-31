package main;

public class Textgametest2 {
	public static void main(String[] args) {
		
		String[] inputs = {"use","look","visit","check inventory","help"};
		Textgame.help();
		Textgame.main(args);
		Textgame.visit("friendsHouse");
		Textgame.visit("libraryFrontSection");
		Textgame.visit("libraryBackSection");
		Textgame.visit("home");
		Textgame.checkInput(inputs);
	}
}

