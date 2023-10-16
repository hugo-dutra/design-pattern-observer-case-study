package bridge.loggermanager.implementations;


import bridge.loggermanager.interfaces.IStorage;

public class ConsoleStorage implements IStorage {

    @Override
    public void writeLog(String data) {
        System.out.println(data);
    }
}
