package singleton.logger;

import singleton.logger.enums.LogLevelEnum;
import singleton.logger.implementations.LoggerHandler;
import singleton.logger.interfaces.Logger;

public class MainLoggerSinglenton {
    public static void main(String[] args) {
        LoggerHandler logger = LoggerHandler.getInstance();
        logger.log("This is a message", LogLevelEnum.INFO);
        logger.log("This is a debug message", LogLevelEnum.DEBUG);
        logger.log("This is an error message", LogLevelEnum.ERROR);
        logger.log("This is a warning message", LogLevelEnum.WARNING);
        System.out.println("Log list: \n");
        logger.printLogList();
    }
}
