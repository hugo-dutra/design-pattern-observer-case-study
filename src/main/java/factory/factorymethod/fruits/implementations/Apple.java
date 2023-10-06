package factory.factorymethod.fruits.implementations;

import factory.factorymethod.fruits.EnumFruits;
import factory.factorymethod.fruits.interfaces.IFruit;

public class Apple implements IFruit {
    @Override
    public float getCalories() {
        return 100;
    }

    @Override
    public EnumFruits getName() {
        return EnumFruits.APPLE;
    }

    @Override
    public String getColor() {
        return "My color is red";
    }

    @Override
    public String getFlavor() {
        return "My flavor is sweet";
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName().getFruitName());
        System.out.println("Color: " + getColor());
        System.out.println("Flavor: " + getFlavor());
        System.out.println("Calories: " + getCalories());
    }
}
