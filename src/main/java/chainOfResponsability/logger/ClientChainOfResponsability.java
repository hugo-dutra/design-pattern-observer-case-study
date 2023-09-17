package chainOfResponsability.logger;

import chainOfResponsability.logger.implementations.LoggerHandlerDebug;
import chainOfResponsability.logger.implementations.LoggerHandlerError;
import chainOfResponsability.logger.implementations.LoggerHandlerInfo;
import chainOfResponsability.logger.implementations.LoggerHandlerWarning;
import chainOfResponsability.logger.interfaces.LoggerHandler;

public class ClientChainOfResponsability {
    public static void main(String[] args) {
        LoggerHandler loggerHandler = new LoggerHandlerInfo();
        LoggerHandler loggerHandlerDebug = new LoggerHandlerDebug();
        LoggerHandler loggerHandlerWarning = new LoggerHandlerWarning();
        LoggerHandler loggerHandlerError = new LoggerHandlerError();

        loggerHandler.setNextLoggerHandler(loggerHandlerDebug);
        loggerHandlerDebug.setNextLoggerHandler(loggerHandlerWarning);
        loggerHandlerWarning.setNextLoggerHandler(loggerHandlerError);


        System.out.println("==================================================");
        loggerHandler.logMessage("This is an info message", chainOfResponsability.logger.enums.LogLevel.INFO, true);
        loggerHandler.logMessage("This is another info message", chainOfResponsability.logger.enums.LogLevel.INFO, true);

        System.out.println("--------------------------------------------------");

        loggerHandler.logMessage("This is a debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG, false);
        loggerHandler.logMessage("This is another debug message", chainOfResponsability.logger.enums.LogLevel.DEBUG, true);

        System.out.println("--------------------------------------------------");

        loggerHandler.logMessage("This is a warning message", chainOfResponsability.logger.enums.LogLevel.WARNING, false);
        loggerHandler.logMessage("This is another warning message", chainOfResponsability.logger.enums.LogLevel.WARNING, false);
        loggerHandler.logMessage("This is another warning message too", chainOfResponsability.logger.enums.LogLevel.WARNING, true);

        System.out.println("--------------------------------------------------");

        loggerHandler.logMessage("This is an error message", chainOfResponsability.logger.enums.LogLevel.ERROR, false);
        loggerHandler.logMessage("This is another error message", chainOfResponsability.logger.enums.LogLevel.ERROR, false);
        loggerHandler.logMessage("This is another error message too", chainOfResponsability.logger.enums.LogLevel.ERROR, true);

        System.out.println("==================================================");

    }
}
