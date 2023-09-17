package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

import java.text.SimpleDateFormat;

public class LoggerHandlerInfo implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    SimpleDateFormat sdFileTextFormat;
    private String logMessage;

    public LoggerHandlerInfo() {
        sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel, boolean showLogMessage) {
        if(logLevel == LogLevel.INFO) {
            this.logMessage = logLevel.getDisplayName() +": " + message  + " - " + sdFileTextFormat.format(new java.util.Date()) + "\n";;
            if (showLogMessage) {
                this.showLogMessage();
            }
        } else {
            this.nextLoggerHandler.logMessage(message, logLevel, showLogMessage);
        }
    }


    private void showLogMessage() {
        System.out.println(this.logMessage);
    }


}
