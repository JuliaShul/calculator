package guru.qa.service;

import guru.qa.Calculator;
import guru.qa.Operation;
import guru.qa.service.mock.MockReader;
import guru.qa.service.mock.MockWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void multTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.MULT), new MockWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void sumTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.SUM), new MockWriter()); // 3, 5, +
        String result = calculator.start();
        Assertions.assertEquals("3 + 5 = 8", result);
    }

    @Test
    void minusTest() {
        calculator = new Calculator(new MockReader(6, 5, Operation.MINUS), new MockWriter()); // 3, 5, -
        String result = calculator.start();
        Assertions.assertEquals("6 - 5 = 1", result);
    }

    @Test
    void deleteTest() {
        calculator = new Calculator(new MockReader(5, 5, Operation.DELETE), new MockWriter()); // 3, 5, /
        String result = calculator.start();
        Assertions.assertEquals("5 / 5 = 1", result);
    }

    @Test
    void exponentaTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.EXPONENTA), new MockWriter()); // 3, 5, ^
        String result = calculator.start();
        Assertions.assertEquals("3 ^ 5 = 243", result);
    }
}