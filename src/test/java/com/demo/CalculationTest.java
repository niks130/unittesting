package com.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculationTest {

	static Calculation cal;
	
	@BeforeEach
	public void init2() {
		cal = new Calculation();
	}
	
	@Test
	public void AdditionTest() {
		assertEquals(cal.add(10,20), 30);
	}
	
	@Test
	public void demoTest() {
		assertFalse(cal.check(20,30));
	}
	
	@Nested
	class AddTest {
		
		@Test
		void addPositive() {
			assertEquals(cal.add(1,1),2 );
		}
		
		@Test
		void addNegative() {
			assertEquals(cal.add(-1, -2), -3 );
		}
		
		@Test
		void addPositiveNegat() {
			assertEquals(cal.add(1,-1),0 );
		}
	}
	
	@Test
	void multiplyTest() {
		assertAll(
				() -> assertEquals(0, cal.multiply(1,0)), () -> assertEquals(1, cal.multiply(1,1)), 
				() -> assertEquals(2, cal.multiply(1,2)));
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->cal.divide(1,0), "Denominator should not be zero");
	}
}
