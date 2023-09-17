package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;

public class LoggerHandlerDebug implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(logLevel == LogLevel.DEBUG) {
            this.logMessageToFile(message);
        } else {
            this.nextLoggerHandler.logMessage(message, logLevel);
        }
    }

    private void logMessageToFile(String message) {
        SimpleDateFormat  sdFileFormat = new SimpleDateFormat ("yyyy-MM-dd");
        String currentDate = sdFileFormat.format(new java.util.Date());
        String fileName = "debug-" + currentDate + ".log";

        SimpleDateFormat sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String textToAppend = "DEBUG: " + message  + " - " + sdFileTextFormat.format(new java.util.Date()) + "\n";

        try{
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(textToAppend);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
