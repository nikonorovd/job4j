package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public  void whenSubtractOneMinusOneThehTwo(){
        Calculator acalc = new Calculator();
        double result = acalc.subtract(1D, 1D);
        double expected = 0D;
        assertThat(result, is(expected));

    }
    @Test
    public  void whenDivOneMinusOneThehTwo(){
        Calculator bcalc = new Calculator();
        double result = bcalc.div(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));

    }
    @Test
    public  void whenmultipleOnePlusOneThehTwo(){
        Calculator ccalc = new Calculator();
        double result = ccalc.multiple(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));

    }

}