package factory.factorymethod.games.implementations;

import factory.factorymethod.games.interfaces.IEnemy;

public class Ghost implements IEnemy {
    @Override
    public void attack() {
        System.out.println("Ghost attack!");
    }

    @Override
    public void move() {
        System.out.println("Ghost move!");
    }

    @Override
    public void showActions() {
        attack();
        move();
    }
}
