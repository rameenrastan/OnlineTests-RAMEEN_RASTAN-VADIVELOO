package com.acquisio.basic.java.question08;

import static org.junit.Assert.*;

import org.junit.Test;

//tests multiplication operation
public class MultiplicationTest {

	@Test
	public void test() {
		
		Calculator calc = new Calculator();
		int output = calc.applyOperation(14, 6, '*');
		assertEquals(84,output);
		
	}

}
