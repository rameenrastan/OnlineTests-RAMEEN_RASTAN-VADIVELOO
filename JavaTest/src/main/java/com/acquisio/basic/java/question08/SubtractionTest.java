package com.acquisio.basic.java.question08;

import static org.junit.Assert.*;

import org.junit.Test;


//tests substraction operation
public class SubtractionTest {

	@Test
	public void test() {
		
		Calculator calc = new Calculator();
		int output = calc.applyOperation(10, 3, '-');
		assertEquals(7,output);
		
	}

}
