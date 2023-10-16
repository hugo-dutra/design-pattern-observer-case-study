package bridge.loggermanager.implementations;

import bridge.loggermanager.interfaces.ILoggerFormatter;
import bridge.loggermanager.models.LogModel;
import org.w3c.dom.Text;

public class TextLogger implements ILoggerFormatter {

    private final LogModel logModel;

    public TextLogger(LogModel logModel) {
        this.logModel = logModel;
    }

    @Override
    public String formatLog() {
        return String.format("TextLogger: %s - %s - %s", logModel.getDate(), logModel.getType(), logModel.getMessage())+ "\n";
    }
}
