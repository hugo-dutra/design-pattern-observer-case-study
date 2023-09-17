package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

public class LoggerHandlerInfo implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(logLevel == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else {
            this.nextLoggerHandler.logMessage(message, logLevel);
        }
    }


}
