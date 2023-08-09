package homework3.main.classes.workFile;

import homework3.main.abstractC.AFindTheSameFileName;

import java.io.File;

public class CFindTheSameFileName extends AFindTheSameFileName {


    @Override
    public boolean findTheSameFileName(String lastName, String folderName) {
        super.folder = new File(folderName);
        boolean found = false;

        for(File file: this.folder.listFiles()){
            String fileName = file.getName().split("\\.")[0];

            if(fileName.equals(lastName)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
