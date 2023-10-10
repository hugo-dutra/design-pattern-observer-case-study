package calculator.implementations;

import calculator.interfaces.ICalc;

import java.util.HashMap;
import java.util.function.Function;

public class Power implements ICalc {
    @Override
    public double process(double[] values) {
        HashMap<Integer, Function<double[], Double>> map = new HashMap<>();
        map.put(0, this::handleWrongValues);
        map.put(2, this::handleCorrectParams);
        return map.getOrDefault(values.length, map.get(0)).apply(values);
    }

    private double handleCorrectParams(double[] values){
      return Math.pow(values[0], values[1]);
    }

    private Double handleWrongValues(double[] values){
      throw new IllegalArgumentException("Wrong values provided");
    }


}
