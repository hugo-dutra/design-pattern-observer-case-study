package factory.games.implementations;

import factory.games.enums.EnumEnemy;
import factory.games.interfaces.IEnemy;
import factory.games.interfaces.IEnemyFactory;

import java.util.HashMap;

public class EnemyFactory implements IEnemyFactory {
    HashMap<EnumEnemy, IEnemy> enemies = new HashMap<>();
    private static volatile EnemyFactory instance;

    private EnemyFactory() {
        fillHashMap();
    }

    public static EnemyFactory getInstance() {
        synchronized (EnemyFactory.class) {
            if (instance == null) {
                instance = new EnemyFactory();
            }
        }
        return instance;
    }

    private void fillHashMap() {
        enemies.put(EnumEnemy.SKULL, new Skull());
        enemies.put(EnumEnemy.ZOMBIE, new Zombie());
        enemies.put(EnumEnemy.GHOST, new Ghost());
    }

    @Override
    public IEnemy createEnemy(EnumEnemy enemy) {
        return enemies.get(enemy);
    }
}
