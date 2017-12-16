package edu.slaxxx.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibServiceTest {

	
	private static final int NORMAL_INPUT_55 = 55;
	private static final int NORMAL_INPUT_1 = 1;
	private static final int INPUT_TOO_LARGE = 100000;


	@Test
	public void getFibTest() throws Exception {
		long fib = FibService.getFib(1);
		assertEquals(NORMAL_INPUT_1, fib);
		compiler fehler
		fib = FibService.getFib(10);
		assertEquals(NORMAL_INPUT_55, fib);
	}
	
	
	@Test
	public void toBigInputTest() throws Exception {
		long fib = FibService.getFib(INPUT_TOO_LARGE);
		
		assertEquals(-1, fib);
	}
	
	@Test
	public void InvalidInputTest() throws Exception {
		long fib = FibService.getFib(-1);
		assertEquals(-1, fib);
	}
}
