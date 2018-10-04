package br.com.diin.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.diin.algorithm.Fibonacci;

class FibonacciTest {

	Fibonacci fibonacci = new Fibonacci();

	@Test
	void testEqualInitial() {
		assertEquals("0,1,", fibonacci.createSequence(1));
	}
	
	@Test
	void testEqualSequence() {
		assertEquals("5", fibonacci.createSequence(6).split(",")[5]);
		assertEquals("8", fibonacci.createSequence(6).split(",")[6]);
		assertEquals("377", fibonacci.createSequence(10).split(",")[14]);
	}

	@Test
	void testParameterNegative() {
		assertEquals(0, fibonacci.createSequence(-1).length());
	}

}
