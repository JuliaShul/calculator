package guru.qa.service;

import guru.qa.Calculator;
import guru.qa.service.mock.MockMultReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorTest() {
        calculator = new Calculator(new MockMultReader()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }
}