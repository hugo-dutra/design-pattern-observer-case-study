package chainOfResponsability.logger.interfaces;

import chainOfResponsability.logger.enums.LogLevel;

public interface LoggerHandler {
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler);
    public void logMessage(String message, LogLevel logLevel, boolean showLogMessage);


}
