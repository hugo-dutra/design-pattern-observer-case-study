package calculator.implementations;

import calculator.interfaces.ICalc;

import java.util.Arrays;

public class Sum implements ICalc {
    @Override
    public double process(double[] values) {
        double result = 0;
        if(values.length == 0) return 0;
        for (double value : values) {
            result += value;
        }
        return result;
    }
}
