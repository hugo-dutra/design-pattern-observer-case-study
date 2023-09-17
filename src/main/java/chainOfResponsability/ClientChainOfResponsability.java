package chainOfResponsability;

import chainOfResponsability.logger.implementations.LoggerHandlerDebug;
import chainOfResponsability.logger.implementations.LoggerHandlerInfo;
import chainOfResponsability.logger.interfaces.LoggerHandler;

public class ClientChainOfResponsability {
    public static void main(String[] args) {
        LoggerHandler loggerHandler = new LoggerHandlerInfo();
        LoggerHandler loggerHandlerDebug = new LoggerHandlerDebug();
        LoggerHandler loggerHandlerWarning = new LoggerHandlerDebug();

        loggerHandler.setNextLoggerHandler(loggerHandlerDebug);
        loggerHandlerDebug.setNextLoggerHandler(loggerHandlerWarning);


        loggerHandler.logMessage("This is an info message", chainOfResponsability.logger.enums.LogLevel.INFO, true);
        loggerHandler.logMessage("This is another info message", chainOfResponsability.logger.enums.LogLevel.INFO, true);
        System.out.println("--------------------------------------------------");
        loggerHandler.logMessage("This is a debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG, true);
        loggerHandler.logMessage("This is another debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG, true);
        System.out.println("--------------------------------------------------");
        loggerHandler.logMessage("This is a warning message", chainOfResponsability.logger.enums.LogLevel.WARNING, true);
        loggerHandler.logMessage("This is another warning message", chainOfResponsability.logger.enums.LogLevel.WARNING, true);
        loggerHandler.logMessage("This is another warning message too", chainOfResponsability.logger.enums.LogLevel.WARNING, true);
        System.out.println("--------------------------------------------------");






    }
}
