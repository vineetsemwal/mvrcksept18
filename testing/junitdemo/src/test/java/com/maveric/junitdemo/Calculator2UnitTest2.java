package com.maveric.junitdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Calculator2UnitTest2 {
    @Mock
    Adder adder;
    @InjectMocks
    @Spy
    Calculator2 calculator;


    @BeforeEach
    void setup() {
        System.out.println("*** inside setup");

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