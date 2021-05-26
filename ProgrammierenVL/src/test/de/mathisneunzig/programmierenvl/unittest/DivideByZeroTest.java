package test.de.mathisneunzig.programmierenvl.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mathisneunzig.programmierenvl.DivideByZero;

class DivideByZeroTest {

	@Test
	@DisplayName("Divide by zero test")
    void test(){
        DivideByZero dbz = new DivideByZero();
        assertEquals("Division durch 0 ist nicht möglich.", dbz.getMessage());
        DivideByZero div = assertThrows(DivideByZero.class, new DivideByZero());
    }

}
