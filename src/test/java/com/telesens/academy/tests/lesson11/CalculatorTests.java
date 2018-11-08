package com.telesens.academy.tests.lesson11;

import com.telesens.academy.lesson11.Calculator;
import com.telesens.academy.lesson11.DivisionByZero;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CalculatorTests {

    @Test(expectedExceptions = {DivisionByZero.class})
    public void testDiv() throws DivisionByZero {
        BigDecimal b1 = BigDecimal.ONE;
        BigDecimal b2 = BigDecimal.ZERO;

        Calculator calc = new Calculator();
        calc.div(b1, b2);
    }

    @Test
    public void testDivException() {
        BigDecimal b1 = BigDecimal.ONE;
        BigDecimal b2 = BigDecimal.ZERO;

        Calculator calc = new Calculator();
        try {
            calc.div(b1, b2);
            Assert.fail(); // Если не возникло исключение - фэйлим
        } catch (Throwable exc) {
            if (!(exc instanceof DivisionByZero)) {
                // Если возникло исключение не того типа - фэйлим
                Assert.fail();
            }
        }
    }
}
