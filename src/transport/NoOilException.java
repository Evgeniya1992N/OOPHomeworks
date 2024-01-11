package transport;

import java.io.IOException;

public class NoOilException extends RuntimeException {
    public NoOilException() { super();}

    public NoOilException(String message) {
        super(message);
    }

    public NoOilException(String message, Throwable cause) {
        super(message, cause);
        getMessage();
        getCause();
    }

    public NoOilException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage(){
        return "No oil. Fill in.";
    };
    @Override
    public Throwable getCause(){
        return null;
    };
}
