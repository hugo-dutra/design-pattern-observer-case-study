package factory.factorymethod.fruits.implementations;

import factory.factorymethod.fruits.EnumFruits;
import factory.factorymethod.fruits.interfaces.IFruit;

public class Orange implements IFruit {
    @Override
    public float getCalories() {
        return 150;
    }

    @Override
    public EnumFruits getName() {
        return EnumFruits.ORANGE;
    }

    @Override
    public String getColor() {
        return "My color is orange";
    }

    @Override
    public String getFlavor() {
        return "My flavor is sour";
    }
    public void showInfo() {
        System.out.println("Name: " + getName().getFruitName());
        System.out.println("Color: " + getColor());
        System.out.println("Flavor: " + getFlavor());
        System.out.println("Calories: " + getCalories());
    }
}
