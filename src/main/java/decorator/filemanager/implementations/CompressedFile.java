package decorator.filemanager.implementations;

import decorator.filemanager.interfaces.IFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompressedFile implements IFile {
    private final IFile file;

    public CompressedFile(IFile file){
        this.file = file;
    }
    @Override
    public List<String> read(String fileName) throws FileNotFoundException {
        List<String> lines = file.read(fileName);
        List<String> decompressLines = new ArrayList<>();
        for(String line : lines){
            decompressLines.add(decompress(line));
        }
        return decompressLines;
    }

    @Override
    public void write(List<String> lines, String fileName) throws IOException {
        List<String> compressLines = new ArrayList<>();
        for(String line : lines){
            compressLines.add(compress(line));
        }
        file.write(compressLines, fileName);
    }

    private String decompress(String line){
        System.out.println("Decompressing..."+line);
        return line;
    }

    private String compress(String line){
        System.out.println("Compressing..."+line);
        return line;
    }
}
