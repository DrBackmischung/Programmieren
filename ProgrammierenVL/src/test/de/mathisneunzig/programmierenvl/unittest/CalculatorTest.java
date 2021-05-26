package test.de.mathisneunzig.programmierenvl.unittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import de.mathisneunzig.programmierenvl.DivideByZero;
import de.mathisneunzig.programmierenvl.unittest.Calculator;

class CalculatorTest {
	
	static Calculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
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
	@DisplayName("Addition: Calculate 2+4+5")
	void testAddition() {
		Assertions.assertEquals((long) (2+4+5), calc.add(2, 4, 5));
	}

	@Test
	@DisplayName("Substraction: Calculate 10-5-3")
	void testSubstraction() {
		Assertions.assertEquals((long) (10-5-3), calc.substract(10, 5, 3));
	}

	@Test
	@DisplayName("Multiplication: Calculate 2*4*2")
	void testMultiplication() {
		Assertions.assertEquals((long) (2*4*2), calc.multiply(2, 4, 2));
	}

	@Test
	@DisplayName("Diversion: Calculate 10/2/2")
	void testDiversion() {
		try {
			Assertions.assertEquals((double) 2.5, calc.divide(10, 2, 2));
		} catch (DivideByZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@ParameterizedTest(name="Addition: Calculate {0}+{1}+{2}")
	@DisplayName("Addition mit CSV")
	@CsvSource({
		"2, 2, 2, 6",
		"4, 10, 10, 24",
		"-1, -1, -1, -3",
		"0, 0, 0, 0",
		"0, 1, 2, 3",
		"1000, 1000, 1, 2001"
	})
	void testAdditionCVS(int a, int b, int c, int r) {
		Assertions.assertEquals((long) r, calc.add(a, b, c));
	}

}
