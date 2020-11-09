package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled
class CalculatorTest {

    @Test
    @DisplayName("Using @DisplayName on testAdd")
    void testAdd() {
        Calculator calculatorAdd = new Calculator();
        assertEquals(4, calculatorAdd.add(2, 2));
    }
    @Test
    void testSubtract() {
        Calculator calculatorSubtract = new Calculator();
        assertEquals(0, calculatorSubtract.subtract(2, 2));
    }

    @Test
    void testMultiply() {
        Calculator calculatorMultiply = new Calculator();
        assertEquals(4, calculatorMultiply.multiply(2,2));
    }

    @RepeatedTest(5)
    void testDivision() {
        Calculator calculatorDivide = new Calculator();
        Assertions.assertTrue(1 == calculatorDivide.divide(2,2));
    }

    @AfterEach
    void textAfterEachMethods() {
        System.out.println("This is a message using @AfterEach");
    }
}