package com.maveric.junitdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2UnitTest1 {
    Calculator2 calculator;
    Adder adder;

    @BeforeEach
    void setup() {
        adder = mock(Adder.class);
        Calculator2 calcy = new Calculator2(adder);
        calculator=spy(calcy);
    }

    @Test
    void sum_1() {
        when(adder.add(1,2)).thenReturn(3);
        int result = calculator.sum(1, 2);
        int expectation = 3;
        assertEquals(expectation, result);
        verify(adder).add(1,2);
    }

    /**
     * scenario : number is positive
     * input : 5
     */
    @Test
    void multiplyBy10_1(){
        int input =5;
      // when(calculator.multiply(input,10)).thenReturn(50);
        doReturn(50).when(calculator).multiply(input,10);
        int result=calculator.multiplyBy10(5);
        assertEquals(50,result);
    }
}