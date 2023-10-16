package bridge.loggermanager.abstractions;

import bridge.loggermanager.interfaces.ILoggerFormatter;
import bridge.loggermanager.interfaces.IStorage;
import bridge.loggermanager.models.LogModel;

public class AbstractLogger {
    private final ILoggerFormatter loggerFormatter;
    private final IStorage storage;

    public AbstractLogger(ILoggerFormatter loggerFormatter, IStorage storage) {
        this.loggerFormatter = loggerFormatter;
        this.storage = storage;
    }

    public void log(){
        String data = loggerFormatter.formatLog();
        storage.writeLog(data);
    }
}
