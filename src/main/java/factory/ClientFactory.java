package factory;

import factory.fruitss.fruits.EnumFruits;
import factory.fruitss.fruits.FruitFactory;
import factory.fruitss.fruits.interfaces.IFruit;

public class ClientFactory {
    public static void main(String[] args) {
        FruitFactory fruitFactory = FruitFactory.getInstance();
        IFruit apple = fruitFactory.createFruitByName(EnumFruits.APPLE);
        IFruit avocado = fruitFactory.createFruitByName(EnumFruits.AVOCADO);
        IFruit orange = fruitFactory.createFruitByName(EnumFruits.ORANGE);

        apple.showInfo();
        avocado.showInfo();
        orange.showInfo();
    }
}
