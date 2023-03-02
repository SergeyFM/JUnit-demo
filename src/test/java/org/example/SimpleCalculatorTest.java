package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void twoPlusZeroShouldEqualTwo() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(0,2) == 2);
        assertTrue(calculator.add(0,2) == calculator.add(2,0));
    }
}

