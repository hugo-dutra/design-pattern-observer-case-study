package singleton.logger.implementations;

import singleton.logger.enums.LogLevelEnum;
import singleton.logger.interfaces.Logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class LoggerHandler implements Logger {
    private static LoggerHandler instance = null;
    private List<String> logList = new ArrayList<>();

    public static synchronized LoggerHandler getInstance() {
        if (instance == null) {
            instance = new LoggerHandler();
        }
        return instance;
    }

    @Override
    public void printLogList() {
        logList.forEach(System.out::println);
    }

    @Override
    public void log(String message, LogLevelEnum level) {
        String logMessage = this.buildLogMessage(message, level);
        logList.add(logMessage);
        System.out.println(logMessage);
    }

    @Override
    public String buildLogMessage(String message, LogLevelEnum level) {
        return level.getLogLevel() + ": " + message + " - " + LocalDateTime.now().toString() + "\n";
    }

    @Override
    public List<String> getLogList() {
        return this.logList;
    }
}
