package homework3.main.classes.checkInputData;

import homework3.main.abstractC.ACheckData;
import homework3.main.exceptions.CheckSexException;
import homework3.main.exceptions.IncorrectSexValuesException;

public class CheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
