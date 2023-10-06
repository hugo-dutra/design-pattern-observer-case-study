package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.IComponentFactory;
import factory.abstractfactory.uisample.interfaces.IPanel;
import factory.abstractfactory.uisample.interfaces.ITextBox;
import factory.abstractfactory.uisample.interfaces.Ibutton;

public class ComponentWhite implements IComponentFactory {
    @Override
    public Ibutton createButton() {
        return new ButtonWhite();
    }

    @Override
    public IPanel createPanel() {
        return new PanelWhite();
    }

    @Override
    public ITextBox createTextBox() {
        return new TextBoxWhite();
    }
}
