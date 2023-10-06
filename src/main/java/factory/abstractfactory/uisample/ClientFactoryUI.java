package factory.abstractfactory.uisample;

import factory.abstractfactory.uisample.enums.EnumTheme;
import factory.abstractfactory.uisample.implementations.Theme;
import factory.abstractfactory.uisample.interfaces.*;

public class ClientFactoryUI {
    public static void main(String[] args) {
        IComponentFactory whiteThemeComponentFactory = Theme.getInstance().createComponentFactory(EnumTheme.WHITE);
        Ibutton button = whiteThemeComponentFactory.createButton();
        IPanel panel = whiteThemeComponentFactory.createPanel();
        ITextBox textBox = whiteThemeComponentFactory.createTextBox();

        button.render();
        panel.render();
        textBox.render();

        IComponentFactory blackThemeComponentFactory = Theme.getInstance().createComponentFactory(EnumTheme.BLACK);
        button = blackThemeComponentFactory.createButton();
        panel = blackThemeComponentFactory.createPanel();
        textBox = blackThemeComponentFactory.createTextBox();

        button.render();
        panel.render();
        textBox.render();


    }
}
