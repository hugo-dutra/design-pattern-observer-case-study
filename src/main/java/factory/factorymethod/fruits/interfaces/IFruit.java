package factory.factorymethod.fruits.interfaces;

import factory.factorymethod.fruits.EnumFruits;

public interface IFruit {
    float getCalories();
    EnumFruits getName();
    String getColor();
    String getFlavor();

    void showInfo();
}
