package com.maveric.junitdemo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorUnitTests {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator=new Calculator();
        System.out.println("***inside setup");
    }

    @AfterEach
    void tearDown(){
        calculator=null;
    }


    @Nested
    class SubTests{
        /**
         * scenario : when both numbers are positive
         * inputs: 8, 2
         * expectation :6
         */
        @Test
        void sub_1() {
            System.out.println("***inside sub1");
            int input1 = 8, input2 = 2;
            int result = calculator.sub(input1, input2);
            int expectation = 6;
            assertEquals(expectation, result);

        }


        /**
         * scenario : when one number is negative
         * inputs: 5, -4
         * expectation :1
         */
        @Test
        void sub_2() {
            System.out.println("***inside sub2");
            int input1 = 5, input2 = -4;
            int result = calculator.sub(input1, input2);
            int expectation = 9;
            assertEquals(expectation, result);

        }
    }

    /**
     * tests for add unit
     */
    @Nested
    class AddTests{

        /**
         * scenario : when both numbers are positive
         * inputs: 1, 2
         * expectation :3
         */
        @Test
        void add_1() {
            System.out.println("***inside add1");
            int input1 = 1, input2 = 2;
            int result = calculator.add(input1, input2);
            int expectation = 3;
            assertEquals(expectation, result);

        }

        /**
         * scenario : when one number is negative
         * inputs: 4, -2
         * expectation :2
         */
        @Test
        void add_2() {
            System.out.println("***inside add2");
            int input1 = 4, input2 = -2;
            int result = calculator.add(input1, input2);
            int expectation = 2;
            assertEquals(expectation, result);

        }
    }

    @Nested
    class AddBy10{

        /**
         * scenario: number is positive
         * input:5
         * expectation: 15
         */
        @Test
        void addBy10_1(){
            int input=5;
            int result=calculator.addBy10(input);
            int expectation=15;
            assertEquals(expectation,result);
        }

    }



}