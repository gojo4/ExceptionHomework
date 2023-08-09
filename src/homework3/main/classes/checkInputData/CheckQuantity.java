package homework3.main.classes.checkInputData;

import homework3.main.abstractC.ACheckQuantity;
import homework3.main.exceptions.CheckQuantityException;

public class CheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}