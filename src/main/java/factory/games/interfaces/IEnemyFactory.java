package factory.games.interfaces;

import factory.games.enums.EnumEnemy;
import factory.games.interfaces.IEnemy;

public interface IEnemyFactory {
    IEnemy createEnemy(EnumEnemy enemy);
}
