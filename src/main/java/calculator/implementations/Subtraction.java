package calculator.implementations;

import calculator.interfaces.ICalc;

public class Subtraction implements ICalc {
    @Override
    public double calc(double[] values) {
        double result  = 0;
        if(values.length == 0) return 0;
        for (double value : values) {
            result -= value;
        }
        return result;
    }
}
