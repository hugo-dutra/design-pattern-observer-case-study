package chainOfResponsability;

import chainOfResponsability.logger.implementations.LoggerHandlerDebug;
import chainOfResponsability.logger.implementations.LoggerHandlerInfo;
import chainOfResponsability.logger.interfaces.LoggerHandler;

public class ClientChainOfResponsability {
    public static void main(String[] args) {
        LoggerHandler loggerHandler = new LoggerHandlerInfo();
        LoggerHandler loggerHandlerDebug = new LoggerHandlerDebug();
        loggerHandler.setNextLoggerHandler(loggerHandlerDebug);


        loggerHandler.logMessage("This is an info message", chainOfResponsability.logger.enums.LogLevel.INFO);
        loggerHandler.logMessage("This is another info message", chainOfResponsability.logger.enums.LogLevel.INFO);


        loggerHandler.logMessage("This is a debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG);
        loggerHandler.logMessage("This is another debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG);

    }
}
