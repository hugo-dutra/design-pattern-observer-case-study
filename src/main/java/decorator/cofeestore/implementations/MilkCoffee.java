package decorator.cofeestore.implementations;

import decorator.cofeestore.interfaces.ICoffee;

public class MilkCoffee extends SimpleCoffee {
    private final ICoffee coffee;

    public MilkCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }
}
