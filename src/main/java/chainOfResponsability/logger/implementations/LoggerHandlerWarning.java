package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LoggerHandlerWarning implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    private final List<String> messageQueue = new ArrayList<>();
    SimpleDateFormat sdFileTextFormat;

    public LoggerHandlerWarning() {
        sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    }
    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel, boolean showLogMessage) {
        if(logLevel == LogLevel.WARNING) {
            String textToAppend = logLevel.getDisplayName() +": " + message  + " - " + sdFileTextFormat.format(new java.util.Date()) + "\n";
            messageQueue.add(textToAppend);
            if (showLogMessage) {
                this.showLogMessage();
            }
        } else {
            this.nextLoggerHandler.logMessage(message, logLevel, showLogMessage);
        }
    }

    private void showLogMessage() {
        for (String message : messageQueue) {
            System.out.println(message);
        }
    }
}
