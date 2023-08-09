package homework3.main.exceptions;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Incorrect birthday's format!!!");
    }
}