package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator;

	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}

	@Test
	@DisplayName("sum")
	void test1() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 10;

		assert calculator.sum(first, second).equals(expected);
	}
	@Test
	@DisplayName("sub")
	void test2() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = -4;

		assert calculator.substraction(first, second).equals(expected);
	}


	@Test
	@DisplayName("mul")
	void test3() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 21;

		assert calculator.multiply(first, second).equals(expected);
	}


	@Test
	@DisplayName("div")
	void tes41() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 0;

		assert calculator.division(first, second).equals(expected);
	}


}
