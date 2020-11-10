package com.aldin.kiselica.javatravisplayground;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleCalculatorTest {
    @Test
    void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        int calculation = calc.add(1, 1);
        assertEquals(2, calculation);
    }
    @Test
    void testSub() {
        SimpleCalculator calc = new SimpleCalculator();
        int calculation = calc.sub(1, 1);
        assertEquals( 0, calculation);
    }
    @Test
    void testMul() {
        SimpleCalculator calc = new SimpleCalculator();
        int calculation = calc.mul(3, 5);
        assertEquals(15, calculation);
    }
    @Test
    void testDiv() {
        SimpleCalculator calc = new SimpleCalculator();
        int calculation = calc.div(8, 2);
        assertEquals(4, calculation);
    }
}
