package decorator.filemanager.implementations;

import decorator.filemanager.interfaces.IFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoggedFile implements IFile {
    private final IFile file;

    public LoggedFile(IFile file){
        this.file = file;
    }

    @Override
    public List<String> read(String fileName) throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<>();

            String line;
            while((line = bufferedReader.readLine()) != null){
                lines.add(line);
                logActions("Reading line: "+line);
            }
            bufferedReader.close();
            return lines;
        }catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<String> lines, String fileName) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                logActions("Writing line: "+line);
            }
            bufferedWriter.close();
        }catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void logActions(String action){
        System.out.println("Logging..."+action);
    }
}
