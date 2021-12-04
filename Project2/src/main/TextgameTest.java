package classProject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextgameTest {


	@Test
	void testGetName() {
		Textgame myObject = new Textgame();
		String result = Textgame.getName();
		assertEquals("", result);
	}

}
