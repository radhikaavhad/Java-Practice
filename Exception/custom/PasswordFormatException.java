package Exception.custom;

public class PasswordFormatException extends Exception{

    public PasswordFormatException(String message){
        super(message);
    }
}

// all serious exceptions are extended by Exception - they are checked
// all non-serious exceptions are extended by RunTimeException - they are unchecked

