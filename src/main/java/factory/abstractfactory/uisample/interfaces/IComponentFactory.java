package factory.abstractfactory.uisample.interfaces;

public interface IComponentFactory {
    Ibutton createButton();
    IPanel createPanel();
    ITextBox createTextBox();
}
