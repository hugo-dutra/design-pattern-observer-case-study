package decorator.filemanager.implementations;

import decorator.filemanager.interfaces.IFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EncryptedFile implements IFile{
    private final IFile file;
    public EncryptedFile(IFile file){
        this.file = file;
    }

    @Override
    public List<String> read(String fileName) throws FileNotFoundException {
        List<String> lines = file.read(fileName);
        List<String> decryptedLines = new ArrayList<>();
        for(String line : lines){
            decryptedLines.add(decrypt(line));
        }
        return decryptedLines;
    }

    @Override
    public void write(List<String> lines, String fileName) throws IOException {
        List<String> encryptedLines = new ArrayList<>();
        for(String line : lines){
            encryptedLines.add(encrypt(line));
        }
        file.write(encryptedLines, fileName);
    }

    private String decrypt(String line){
        System.out.println("Decrypting..."+line);
        return line;
    }

    private String encrypt(String line){
        System.out.println("Encrypting..."+line);
        return line;
    }
}
