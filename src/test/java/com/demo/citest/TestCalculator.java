package com.demo.citest;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd() {
        int expected = 10;
        int actual = Calculator.add(4, 6);
        assertEquals(expected, actual);
    }
}
