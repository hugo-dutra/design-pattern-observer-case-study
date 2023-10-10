package calculator.implementations;

import calculator.interfaces.ICalc;

import java.util.HashMap;
import java.util.function.Function;

public class Division implements ICalc {
    @Override
    public double calc(double[] values) {
        HashMap<Integer, Function<double[],Double>> map = new HashMap<>();
        map.put(0, this::handleWrongValues);
        map.put(1, this::handleWrongValues);
        map.put(2, this::handleCorrectParams);
        return map.getOrDefault(values.length, map.get(0)).apply(values);
    }

    private Double handleCorrectParams(double[] values){
        if(values[1] == 0) throw new IllegalArgumentException("Division by zero");
      return values[0] / values[1];
    }

    private Double handleWrongValues(double[] values){
      throw new IllegalArgumentException("Wrong values provided");
    }
}
