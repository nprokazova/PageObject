package com.example.calculator;

import io.qameta.allure.Step;
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
    @Step ("sum")
    @DisplayName("sum")
    void test1() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = 10;

        assert calculator.sum(first, second).equals(expected);
    }

    @Test
    @Step ("sub")
    @DisplayName("sub")
    void test2() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = -4;

        assert calculator.substraction(first, second).equals(expected);
    }


    @Test
    @Step ("mul")
    @DisplayName("mul")
    void test3() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = 21;

        assert calculator.multiply(first, second).equals(expected);
    }


    @Test
    @Step ("div")
    @DisplayName("div")
    void tes41() {
        Integer first = 3;
        Integer second = 7;
        Integer expected = 0;

        assert calculator.division(first, second).equals(expected);
    }


    @Test
    @Step ("exponentiation")
    @DisplayName("exponentiation") //Возведение в степень
    void test5() {
        Double first = 5.0;
        Double second = 4.0;
        Double expected = 625.0;

        assert calculator.exponentiation(first, second).equals(expected);
    }

    @Test
    @Step ("sqrt")
    @DisplayName("sqrt") //Квадратный корень
    void test6() {
        Double first = 25.0;
        Double expected = 5.0;

        assert calculator.sqrt(first).equals(expected);
    }


}
