package decorator.filemanager;

import decorator.filemanager.implementations.CompressedFile;
import decorator.filemanager.implementations.EncryptedFile;
import decorator.filemanager.implementations.LoggedFile;
import decorator.filemanager.implementations.SimpleFile;
import decorator.filemanager.interfaces.IFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientFileManager {
    public static void main(String[] args) throws IOException {

        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("This is a line");
        linesToWrite.add("This is another line");
        linesToWrite.add("This is a third line");

        IFile simpleFile = new SimpleFile();

        simpleFile.write(linesToWrite, "simpleFile.txt");
        List<String> lines =  simpleFile.read("simpleFile.txt");
        lines.forEach(System.out::println);

        System.out.println("--------------------------------------------------");


        List<String> EncryptedlinesToWrite = new ArrayList<>();
        EncryptedlinesToWrite.add("This is a line encrypted");
        EncryptedlinesToWrite.add("This is another line encrypted");
        EncryptedlinesToWrite.add("This is a third line encrypted");


        IFile encryptedFile = new EncryptedFile(simpleFile);
        encryptedFile.write(EncryptedlinesToWrite, "encryptedFile.txt");
        List<String> linesDecripted = encryptedFile.read("encryptedFile.txt");
        linesDecripted.forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        List<String> CompressedlinesToWrite = new ArrayList<>();
        CompressedlinesToWrite.add("This is a line compressed");
        CompressedlinesToWrite.add("This is another line compressed");
        CompressedlinesToWrite.add("This is a third line compressed");

        IFile compressedFile = new CompressedFile(simpleFile);
        compressedFile.write(CompressedlinesToWrite, "compressedFile.txt");
        List<String> linesDecompressed = compressedFile.read("compressedFile.txt");
        linesDecompressed.forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        List<String> loggedLinesToWrite = new ArrayList<>();
        loggedLinesToWrite.add("This is a line logged");
        loggedLinesToWrite.add("This is another line logged");
        loggedLinesToWrite.add("This is a third line logged");

        IFile loggedFile = new LoggedFile(simpleFile);
        loggedFile.write(loggedLinesToWrite, "loggedFile.txt");
        List<String> linesLogged = loggedFile.read("loggedFile.txt");
        linesLogged.forEach(System.out::println);







    }
}
