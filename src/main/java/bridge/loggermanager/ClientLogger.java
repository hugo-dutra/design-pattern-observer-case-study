package bridge.loggermanager;

import bridge.loggermanager.abstractions.AbstractLogger;
import bridge.loggermanager.enums.EnumLogType;
import bridge.loggermanager.implementations.ConsoleStorage;
import bridge.loggermanager.implementations.FileStorage;
import bridge.loggermanager.implementations.JsonLogger;
import bridge.loggermanager.implementations.TextLogger;
import bridge.loggermanager.interfaces.ILoggerFormatter;
import bridge.loggermanager.interfaces.IStorage;
import bridge.loggermanager.models.LogModel;

public class ClientLogger {
    public static void main(String[] args) {
        LogModel logModel = new LogModel("Message log from console with raw text content...", EnumLogType.TXT);
        ILoggerFormatter loggerFormatter = new TextLogger(logModel);
        IStorage storage = new ConsoleStorage();
        AbstractLogger logger = new AbstractLogger(loggerFormatter, storage);
        logger.log();

        logModel = new LogModel("Message log from console with JSON content...", EnumLogType.JSON);
        loggerFormatter = new JsonLogger(logModel);
        logger = new AbstractLogger(loggerFormatter, storage);
        logger.log();

        /*----------------------------------------------------*/

        IStorage fileStorage = new FileStorage();
        logModel = new LogModel("Message log from file with raw text content...", EnumLogType.TXT);
        loggerFormatter = new TextLogger(logModel);
        logger = new AbstractLogger(loggerFormatter, fileStorage);
        logger.log();

        logModel = new LogModel("Message log from file with JSON content...", EnumLogType.JSON);
        loggerFormatter = new JsonLogger(logModel);
        logger = new AbstractLogger(loggerFormatter, fileStorage);
        logger.log();

    }
}
