package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

public class LoggerHandlerError implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    private String logMessage;
    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel, boolean showLogMessage) {
        if(logLevel == LogLevel.ERROR) {
            this.logMessage = logLevel.getDisplayName()+ ": " + message;
            this.sendEmailWithMessageToAdmin();
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

    private void sendEmailWithMessageToAdmin() {
        System.out.println("Sending email with message: " + this.logMessage);
    }
}
