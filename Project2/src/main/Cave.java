
public class Test1 {

	static String NAME = "a";
	static  String PLACE = "cave";
	
    static  String[] input = {"use","look","visit","check inventory","help"};
    static  String command = TextGame.checkInput(input);
	public static void main(String[] args) {
		
		Cave.cave(NAME, PLACE, command, input);
	
	}
