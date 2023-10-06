package factory.fruitss.fruits.interfaces;

import factory.fruitss.fruits.EnumFruits;

public interface IFruit {
    float getCalories();
    EnumFruits getName();
    String getColor();
    String getFlavor();

    void showInfo();
}
