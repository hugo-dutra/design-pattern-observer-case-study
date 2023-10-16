package bridge.loggermanager.implementations;

import bridge.loggermanager.interfaces.ILoggerFormatter;
import bridge.loggermanager.models.LogModel;

public class JsonLogger implements ILoggerFormatter {
    private final LogModel logModel;

    public JsonLogger(LogModel logModel){
        this.logModel = logModel;
    }


    @Override
    public String formatLog() {
        return "{" +
                "\"date\": \"" + logModel.getDate() + "\", " +
                "\"type\": \"" + logModel.getType() + "\", " +
                "\"message\": \"" + logModel.getMessage() + "\"" +
                "}"+ "\n";
    }
}
