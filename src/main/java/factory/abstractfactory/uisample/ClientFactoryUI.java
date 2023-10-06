package factory.abstractfactory.uisample;

import factory.abstractfactory.uisample.enums.EnumTheme;
import factory.abstractfactory.uisample.implementations.Theme;
import factory.abstractfactory.uisample.interfaces.*;

public class ClientFactoryUI {
    public static void main(String[] args) {
        Ibutton button;
        IPanel panel;
        ITextBox textBox;

        IComponentFactory whiteThemeComponentFactory = Theme.getInstance().createComponentFactory(EnumTheme.WHITE);
        button = whiteThemeComponentFactory.createButton();
        panel = whiteThemeComponentFactory.createPanel();
        textBox = whiteThemeComponentFactory.createTextBox();
        button.render();
        panel.render();
        textBox.render();

        System.out.println("\n====================================\n");

        IComponentFactory blackThemeComponentFactory = Theme.getInstance().createComponentFactory(EnumTheme.BLACK);
        button = blackThemeComponentFactory.createButton();
        panel = blackThemeComponentFactory.createPanel();
        textBox = blackThemeComponentFactory.createTextBox();
        button.render();
        panel.render();
        textBox.render();


    }
}
