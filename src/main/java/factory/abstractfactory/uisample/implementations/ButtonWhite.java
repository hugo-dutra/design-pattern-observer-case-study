package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.Ibutton;

public class ButtonWhite implements Ibutton {
    @Override
    public void render() {
        System.out.println("ButtonWhite");
    }
}
