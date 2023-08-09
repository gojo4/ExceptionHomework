package homework3.main.interfaces;

import homework3.main.exceptions.MyFileCreateException;
import homework3.main.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}