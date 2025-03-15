package com.kodilla.spring.forum.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {

        double result = calculator.add(5, 3);

        assertEquals(8, result);
    }

    @Test
    void testSub() {

        double result = calculator.sub(10, 4);

        assertEquals(6, result);
    }

    @Test
    void testMul() {
        // When
        double result = calculator.mul(3, 4);

        assertEquals(12, result);
    }

    @Test
    void testDiv() {

        double result = calculator.div(9, 3);

        assertEquals(3, result);
    }

    @Test
    void testDivByZero() {

        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }
}
