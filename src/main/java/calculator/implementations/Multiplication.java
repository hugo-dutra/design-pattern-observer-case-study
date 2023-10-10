package calculator.implementations;

import calculator.interfaces.ICalc;

public class Multiplication implements ICalc {
    @Override
    public double calc(double[] values) {
        if(values.length == 0) return 0;
        if(values.length == 1) return values[0];
        double result = 0;
        for (double value : values) {
            result *= value;
        }
        return result;
    }
}
