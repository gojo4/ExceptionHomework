package homework3.main.exceptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        super("Failed to convert string to integer!: " + s);
    }
}