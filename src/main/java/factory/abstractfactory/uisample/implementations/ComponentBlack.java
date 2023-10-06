package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.IComponentFactory;
import factory.abstractfactory.uisample.interfaces.IPanel;
import factory.abstractfactory.uisample.interfaces.ITextBox;
import factory.abstractfactory.uisample.interfaces.Ibutton;

public class ComponentBlack implements IComponentFactory {
    @Override
    public Ibutton createButton() {
        return new ButtonBlack();
    }

    @Override
    public IPanel createPanel() {
        return new PanelBlack();
    }

    @Override
    public ITextBox createTextBox() {
        return new TextBoxBlack();
    }
}
