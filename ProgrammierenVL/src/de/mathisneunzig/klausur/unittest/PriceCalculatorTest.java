package de.mathisneunzig.klausur.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PriceCalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Rechnet Preise aus")
	void test() {
		
		double price = PriceCalculator.calculate(1, 1);
		Assertions.assertEquals(6.0, price);
		price = PriceCalculator.calculate(2, 2);
		Assertions.assertEquals(12.0, price);
		
	}
	
	//Parametrisierter Test mit Eingabewerten statt Zahlen im CSV Format
	
	@ParameterizedTest
	@CsvSource({
		"1, 1, 6.0",
		"2, 2, 12.0",
		"3, 2, 15.5",
		"4, 4, 24.0"})
	void test2(int adults, int childs, double result) {
		double price = PriceCalculator.calculate(adults, childs);
		Assertions.assertEquals(result, price);
	}

}
