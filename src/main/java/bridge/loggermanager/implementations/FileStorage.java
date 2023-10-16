package bridge.loggermanager.implementations;

import bridge.loggermanager.interfaces.IStorage;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileStorage implements IStorage {
    @Override
    public void writeLog(String data) {
        try{
            FileWriter fileWriter = new FileWriter("log.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
