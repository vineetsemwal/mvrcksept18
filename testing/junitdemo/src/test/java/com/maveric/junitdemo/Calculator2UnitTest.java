package com.maveric.junitdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2UnitTest {
    Calculator2 calculator;
    Adder adder;

    @BeforeEach
    void setup() {
        adder = mock(Adder.class);
        calculator = new Calculator2(adder);
    }

    @Test
    void sum_1() {
        when(adder.add(1,2)).thenReturn(3);
        int result = calculator.sum(1, 2);
        int expectation = 3;
        assertEquals(expectation, result);
        verify(adder).add(1,2);
    }
}