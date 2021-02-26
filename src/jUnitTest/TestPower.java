package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Projects.PowerFunction;

class TestPower {

	@Test
	void test() {
		PowerFunction func = new PowerFunction();
		int result = func.pow(3, 3);
		assertEquals(27, result);
	}

}
