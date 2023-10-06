package factory.factorymethod.games.implementations;

import factory.factorymethod.games.interfaces.IEnemy;

public class Zombie implements IEnemy {
    @Override
    public void attack() {
        System.out.println("Zombie attack!");
    }

    @Override
    public void move() {
        System.out.println("Zombie move!");
    }

    @Override
    public void showActions() {
        attack();
        move();
    }
}
