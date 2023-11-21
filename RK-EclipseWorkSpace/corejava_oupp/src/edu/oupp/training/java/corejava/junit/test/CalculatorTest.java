package edu.oupp.training.java.corejava.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.oupp.training.java.corejava.junit.Calculator;

public class CalculatorTest {
	Calculator calculator=new Calculator();

	@Test
	public void testAdd(){
		assertEquals(5,calculator.add(2, 3));
		assertEquals(-1,calculator.add(-2, 1));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(10,calculator.subtraction(15, 5));
		assertEquals(4,calculator.subtraction(2, -2));
	}

	@Test
	public void testMultiplication(){
		assertEquals(75,calculator.multiplication(15, 5));
		assertEquals(-8,calculator.multiplication(4, -2));
	}

	@Test
	public void testDivision(){
		assertEquals(3,calculator.division(15, 5));
		assertEquals(1,calculator.division(-2, -2));
		assertEquals(4,calculator.division(16, 4));
		assertEquals(0,calculator.division(0, 4));
		try{
			calculator.division(5,0);
			fail("Expected ArithmeticException for division");
		}catch (ArithmeticException e){
			assertEquals("Can not divide by zero",e.getMessage());
		}

	}
}
