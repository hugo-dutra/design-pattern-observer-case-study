package factory.abstractfactory.uisample.implementations;

import factory.abstractfactory.uisample.enums.EnumTheme;
import factory.abstractfactory.uisample.interfaces.IComponentFactory;
import factory.abstractfactory.uisample.interfaces.ITheme;

import java.util.HashMap;

public class Theme implements ITheme {
    HashMap<EnumTheme, IComponentFactory> componentFactoryHashMap = new HashMap<>();

    public Theme() {
        componentFactoryHashMap.put(EnumTheme.WHITE, new ComponentWhite());
        componentFactoryHashMap.put(EnumTheme.BLACK, new ComponentBlack());
    }

    private static volatile Theme instance;

    public static Theme getInstance() {
        synchronized (Theme.class){
            if (instance == null) {
                instance = new Theme();
            }
        }
        return instance;
    }

    @Override
    public IComponentFactory createComponentFactory(EnumTheme theme) {
        return componentFactoryHashMap.get(theme);
    }
}
