package guru.qa.service;

import guru.qa.Calculator;
import guru.qa.Operation;
import guru.qa.service.mock.MockMultReader;
import guru.qa.service.mock.MockMultWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void multTest() {
        calculator = new Calculator(new MockMultReader(3, 5, Operation.MULT), new MockMultWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void sumTest() {
        calculator = new Calculator(new MockMultReader(3, 5, Operation.SUM), new MockMultWriter()); // 3, 5, +
        String result = calculator.start();
        Assertions.assertEquals("3 + 5 = 8", result);
    }

    @Test
    void minusTest() {
        calculator = new Calculator(new MockMultReader(6, 5, Operation.MINUS), new MockMultWriter()); // 3, 5, -
        String result = calculator.start();
        Assertions.assertEquals("6 - 5 = 1", result);
    }

    @Test
    void deleteTest() {
        calculator = new Calculator(new MockMultReader(5, 5, Operation.DELETE), new MockMultWriter()); // 3, 5, /
        String result = calculator.start();
        Assertions.assertEquals("5 / 5 = 1", result);
    }

    @Test
    void exponentaTest() {
        calculator = new Calculator(new MockMultReader(3, 5, Operation.EXPONENTA), new MockMultWriter()); // 3, 5, ^
        String result = calculator.start();
        Assertions.assertEquals("3 ^ 5 = 243", result);
    }
}