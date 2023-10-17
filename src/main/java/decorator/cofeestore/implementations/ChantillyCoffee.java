package decorator.cofeestore.implementations;

import decorator.cofeestore.interfaces.ICoffee;

public class ChantillyCoffee extends SimpleCoffee{
    private final ICoffee coffee;

    public ChantillyCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", chantilly";
    }
}
