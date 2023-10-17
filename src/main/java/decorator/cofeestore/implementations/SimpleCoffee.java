package decorator.cofeestore.implementations;

import decorator.cofeestore.interfaces.ICoffee;

public class SimpleCoffee implements ICoffee {
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
