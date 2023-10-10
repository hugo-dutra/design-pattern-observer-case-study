package calculator;

import calculator.implementations.*;
import calculator.interfaces.ICalc;

import java.util.Arrays;

public class ClientCalculator {
    public static void main(String[] args) {
        try {
            ICalc calc = new Sum();
            double[] values = {1, 2, 3, 4, 5};
            System.out.println(calc.process(values));

            ICalc subtraction = new Subtraction();
            double[] values2 = {5, 4, 3, 2, 1};
            System.out.println(subtraction.process(values2));

            ICalc multiplication = new Multiplication();
            double[] values3 = {1, 2, 3, 4, 5};
            System.out.println(multiplication.process(values3));

            ICalc division = new Division();
            double[] values4 = {5, 2};
            System.out.println(division.process(values4));

            ICalc pow = new Power();
            double[] values5 = {4, 2};
            System.out.println(pow.process(values5));

            ICalc sqrt = new Power();
            double[] values6 = {4, 0.5};
            System.out.println(sqrt.process(values6));

            double[] valuesWrong = {5, 2, 5, 0};
            System.out.println(division.process(valuesWrong));

        } catch (Exception e) {
            System.out.println(e.getMessage() + ":" + Arrays.stream(e.getStackTrace()).findFirst());
        }
    }
}
