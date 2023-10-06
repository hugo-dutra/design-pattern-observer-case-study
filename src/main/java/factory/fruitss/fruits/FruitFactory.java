package factory.fruitss.fruits;

import factory.fruitss.fruits.implementations.Apple;
import factory.fruitss.fruits.implementations.Avocado;
import factory.fruitss.fruits.implementations.Orange;
import factory.fruitss.fruits.interfaces.IFruit;

import java.util.HashMap;

public class FruitFactory {
    private final HashMap<EnumFruits, IFruit> fruitMap = new HashMap<>();
    private static volatile FruitFactory instance;

    private FruitFactory() {
        fillHashMap();
    }

    public static FruitFactory getInstance() {
        if (instance == null) {
            synchronized (FruitFactory.class) {
                if (instance == null)
                    instance = new FruitFactory();
            }
        }
        return instance;
    }

    private void fillHashMap() {
        fruitMap.put(EnumFruits.APPLE, new Apple());
        fruitMap.put(EnumFruits.AVOCADO, new Avocado());
        fruitMap.put(EnumFruits.ORANGE, new Orange());
    }

    public IFruit createFruitByName(EnumFruits fruitName) {
         return fruitMap.get(fruitName);
    }
}
