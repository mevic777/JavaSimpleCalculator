package com.step;

import com.step.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
	    Calculator calc = new Calculator();

        calc.sum(5, 4);
        calc.decrease(5, 4);
        calc.division(5, 4);
        calc.multiplication(5, 4);
    }
}
