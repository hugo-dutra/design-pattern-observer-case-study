package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.IPanel;

public class PanelBlack implements IPanel {
    @Override
    public void render() {
        System.out.println("PanelBlack");
    }
}
