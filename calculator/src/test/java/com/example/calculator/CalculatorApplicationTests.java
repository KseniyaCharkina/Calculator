package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("test sum")
    void test1() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = 10;
        assert calculator.sum(first, second).equals(expected);
    }


    @Test
    @DisplayName("test subtraction")
    void test2() {
        Integer first = 9;
        Integer second = 6;
        Integer expected = 3;
        assert calculator.subtraction(first, second).equals(expected);
    }

    @Test
    @DisplayName("test multiply")
    void test3() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = 21;
        assert calculator.multiply(first, second).equals(expected);
    }

    @Test
    @DisplayName("test division")
    void test4() {
        Integer first = 30;
        Integer second = 10;
        Integer expected = 3;
        assert calculator.division(first, second).equals(expected);
    }

    @Test
    @DisplayName("test exponentiation")
    void test5() {
        double val1 = 6;
        double val2 = 2;
        double expected = 36;
        assert calculator.exponentiation(val1, val2).equals(expected);
    }

    @Test
    @DisplayName("test exponentiation")
    void test6() {
        double val1 = 36;
        double expected = 6;
        assert calculator.root(val1).equals(expected);
    }
}
