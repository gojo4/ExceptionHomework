package homework3.main.interfaces;

import homework3.main.exceptions.FileCreateException;
import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
