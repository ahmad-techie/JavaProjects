package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Projects.PowerFunction;
import Projects.ReverseString;

class TestPower {
	
	@Test
	public void testPowerFunction() {
		PowerFunction func = new PowerFunction();
		int result = func.pow(3, 3);
		assertEquals(27, result);
	}
	
	@Test
	public void testReverseString() {
		ReverseString rStr = new ReverseString();
		String testReverse = rStr.reverseName("Hello");
		assertEquals("olleH", testReverse);
	}

}
