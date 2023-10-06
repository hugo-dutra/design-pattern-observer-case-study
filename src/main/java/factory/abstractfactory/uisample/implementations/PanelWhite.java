package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.IPanel;

public class PanelWhite implements IPanel {
    @Override
    public void render() {
        System.out.println("PanelWhite");
    }
}
