package com.acquisio.basic.java.question08;

import static org.junit.Assert.*;

import org.junit.Test;

//tests division operation
public class DivisionTest {

	@Test
	public void test() {
		
		Calculator calc = new Calculator();
		int output = calc.applyOperation(54, 2, '/');
		assertEquals(27,output);
	}

}
