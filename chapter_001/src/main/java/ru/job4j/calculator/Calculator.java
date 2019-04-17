
package ru.job4j.calculator;

/**
 *Class calculator
 */

public class Calculator {
    /**
     * Method to add some double
     * @param  first param
     * @param  second param
     * @return result of add, subtract, div, multiple
     */

    public double add(double first, double second) {
        return first + second;

    }
    public double subtract (double first, double second){
        return first - second;
    }
    public double div (double first, double second){
        return first / second;
    }
    public double multiple (double first, double second)
    {
        return first * second;
    }
    
}