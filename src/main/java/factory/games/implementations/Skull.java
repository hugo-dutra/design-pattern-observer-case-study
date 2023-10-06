package factory.games.implementations;

import factory.games.interfaces.IEnemy;

public class Skull implements IEnemy {
    @Override
    public void attack() {
        System.out.println("Skull attack!");
    }

    @Override
    public void move() {
        System.out.println("Skull move!");
    }

    @Override
    public void showActions() {
        attack();
        move();
    }
}
