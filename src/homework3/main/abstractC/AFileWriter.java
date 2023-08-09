package homework3.main.abstractC;

import homework3.main.classes.workFile.CFileCreator;
import homework3.main.classes.workFile.CFindTheSameFileName;
import homework3.main.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}