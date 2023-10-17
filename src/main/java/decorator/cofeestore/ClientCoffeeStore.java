package decorator.cofeestore;

import decorator.cofeestore.implementations.ChantillyCoffee;
import decorator.cofeestore.implementations.MilkCoffee;
import decorator.cofeestore.implementations.SimpleCoffee;
import decorator.cofeestore.implementations.SugarCoffee;
import decorator.cofeestore.interfaces.ICoffee;

public class ClientCoffeeStore {
    public static void main(String[] args) {
        ICoffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        ICoffee sugarCoffee = new SugarCoffee(coffee);
        System.out.println("Cost: " + sugarCoffee.getCost() + "; Description: " + sugarCoffee.getDescription());

        ICoffee milkCoffee = new MilkCoffee(sugarCoffee);
        System.out.println("Cost: " + milkCoffee.getCost() + "; Description: " + milkCoffee.getDescription());

        ICoffee chantillyCoffee = new ChantillyCoffee(milkCoffee);
        System.out.println("Cost: " + chantillyCoffee.getCost() + "; Description: " + chantillyCoffee.getDescription());
    }

}
