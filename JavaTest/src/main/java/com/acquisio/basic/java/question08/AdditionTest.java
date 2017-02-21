package com.acquisio.basic.java.question08;

import static org.junit.Assert.*;

import org.junit.Test;

//tests addition operation
public class AdditionTest {

	@Test
	public void test() {
		
		Calculator calc = new Calculator();
		int output = calc.applyOperation(4, 11, '+');
		assertEquals(15,output);
		
	}

}
