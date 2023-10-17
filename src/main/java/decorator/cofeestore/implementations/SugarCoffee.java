package decorator.cofeestore.implementations;

import decorator.cofeestore.interfaces.ICoffee;

public class SugarCoffee extends SimpleCoffee {
    private final ICoffee coffee;

    public SugarCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", suggar";
    }

}
