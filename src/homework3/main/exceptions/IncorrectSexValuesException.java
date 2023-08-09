package homework3.main.exceptions;

public class IncorrectSexValuesException extends RuntimeException{
    public IncorrectSexValuesException() {
        super("Incorrect sex value!!!");
    }
}