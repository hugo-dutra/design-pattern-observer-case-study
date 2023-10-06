package factory.games;

import factory.games.enums.EnumEnemy;
import factory.games.implementations.EnemyFactory;
import factory.games.interfaces.IEnemy;
import factory.games.interfaces.IEnemyFactory;

public class GamesFactoryClient {
    public static void main(String[] args) {
        IEnemyFactory enemyFactory = EnemyFactory.getInstance();
        IEnemy zombie = enemyFactory.createEnemy(EnumEnemy.ZOMBIE);
        IEnemy skull = enemyFactory.createEnemy(EnumEnemy.SKULL);
        IEnemy ghost = enemyFactory.createEnemy(EnumEnemy.GHOST);

        zombie.showActions();
        skull.showActions();
        ghost.showActions();
    }
}
