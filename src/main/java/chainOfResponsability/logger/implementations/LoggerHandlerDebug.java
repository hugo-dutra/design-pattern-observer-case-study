package chainOfResponsability.logger.implementations;

import chainOfResponsability.logger.enums.LogLevel;
import chainOfResponsability.logger.interfaces.LoggerHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;

public class LoggerHandlerDebug implements LoggerHandler {
    private LoggerHandler nextLoggerHandler;
    SimpleDateFormat sdFileTextFormat;
    private LogLevel logLevel;

    public LoggerHandlerDebug() {
        sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel, boolean showLogMessage) {
        this.logLevel = logLevel;
        if (logLevel == LogLevel.DEBUG) {
            this.logMessageToFile(message);
            if (showLogMessage) {
                this.showLogMessage();
            }
        } else {
            this.nextLoggerHandler.logMessage(message, logLevel, showLogMessage);
        }
    }

    private void logMessageToFile(String message) {
        sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd");
        String currentDate = sdFileTextFormat.format(new java.util.Date());
        String fileName = this.logLevel.getDisplayName()+ "-" + currentDate + ".log";

        SimpleDateFormat sdFileTextFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String textToAppend = this.logLevel.getDisplayName()+": " + message  + " - " + sdFileTextFormat.format(new java.util.Date()) + "\n";

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


    private void showLogMessage() {
        String currentDate = sdFileTextFormat.format(new java.util.Date());
        String fileName = this.logLevel.getDisplayName()+"-" + currentDate + ".log";

        try{
            File file = new File(fileName);
            if(!file.exists()){
                System.out.println("File not found");
            } else {
                java.util.Scanner scanner = new java.util.Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
