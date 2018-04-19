package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.add;

public class addTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		add addition = new add();
		int result = addition.add(2, 3);
		assertEquals(5, result);
	}

}
