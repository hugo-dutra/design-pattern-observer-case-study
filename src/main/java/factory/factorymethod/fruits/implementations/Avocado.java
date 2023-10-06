package factory.factorymethod.fruits.implementations;

import factory.factorymethod.fruits.EnumFruits;
import factory.factorymethod.fruits.interfaces.IFruit;

public class Avocado implements IFruit {
    @Override
    public float getCalories() {
        return 250;
    }

    @Override
    public EnumFruits getName() {
        return EnumFruits.AVOCADO;
    }

    @Override
    public String getColor() {
        return "My color is green";
    }

    @Override
    public String getFlavor() {
        return "My flavor is buttery";
    }
    public void showInfo() {
        System.out.println("Name: " + getName().getFruitName());
        System.out.println("Color: " + getColor());
        System.out.println("Flavor: " + getFlavor());
        System.out.println("Calories: " + getCalories());
    }
}
