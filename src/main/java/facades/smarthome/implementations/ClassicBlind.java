package facades.smarthome.implementations;

import facades.smarthome.interfaces.IBlind;

public class ClassicBlind implements IBlind {
    @Override
    public void open() {
        System.out.println("ClassicBlind.open()");
    }

    @Override
    public void close() {
        System.out.println("ClassicBlind.close()");
    }

    @Override
    public void setPercentage(int percentage) {
        System.out.println("ClassicBlind.setPercentage()");
    }

}
