package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.interfaces.ITextBox;

public class TextBoxBlack implements ITextBox {
    @Override
    public void render() {
        System.out.println("TextBoxBlack");
    }
}
