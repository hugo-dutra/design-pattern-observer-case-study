package factory.abstractfactory.uisample.interfaces;

import factory.abstractfactory.uisample.enums.EnumTheme;

public interface ITheme {
    IComponentFactory createComponentFactory(EnumTheme theme);
}
