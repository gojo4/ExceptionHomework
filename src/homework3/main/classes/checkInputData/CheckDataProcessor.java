package homework3.main.classes.checkInputData;

import homework3.main.abstractC.ACheckData;
import homework3.main.abstractC.ACheckDataProcessor;
import homework3.main.abstractC.ACheckFullName;
import homework3.main.abstractC.ACheckQuantity;

public class CheckDataProcessor extends ACheckDataProcessor {
    public CheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public boolean checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Birthday format is FINE.");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Full name format is FINE.");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Quantity data is FINE.");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Sex format is FINE.");
        return true;
    }
}