package classProject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextgameTest {

	@Test
	void testCheckInput() {
		Textgame myObject = new Textgame();
		String[] inputs = {"Car", "truck", "motorcycle", "vehicle", "plane"};
		String result = myObject.checkInput(inputs);
		boolean correct = false;
		for(int i =0; i<inputs.length; i++) {
			if(inputs[i].equals(result)) {
				correct =true;
			}
		}
		assertEquals(true, correct);
	}


	@Test
	void testGetName() {
		Textgame myObject = new Textgame();
		String result = Textgame.getName();
		assertEquals("", result);
	}

}
