package homework3.main.classes.checkInputData;

import homework3.main.abstractC.ACheckFullName;
import homework3.main.exceptions.FullNameContainsDigitException;
import homework3.main.exceptions.FullNameEmptyValueException;

public class CheckFullName extends ACheckFullName {

    @Override
    public boolean checkFullName(String[] fullName) {

        for (int i = 0; i < fullName.length; i++) {
            if(fullName[i].length()==0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < fullName[i].length(); j++) {
                if(Character.isDigit(fullName[i].charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
        return true;
    }
}