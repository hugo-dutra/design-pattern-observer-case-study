package decorator.filemanager.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IFile {
    public List<String> read(String fileName) throws FileNotFoundException;
    public void write(List<String> lines, String fileName) throws IOException;
}
