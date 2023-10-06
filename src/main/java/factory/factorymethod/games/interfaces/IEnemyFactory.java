package factory.factorymethod.games.interfaces;

import factory.factorymethod.games.enums.EnumEnemy;

public interface IEnemyFactory {
    IEnemy createEnemy(EnumEnemy enemy);
}
