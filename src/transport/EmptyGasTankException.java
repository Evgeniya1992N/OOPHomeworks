package transport;

public class EmptyGasTankException extends RuntimeException{
    public EmptyGasTankException() { super();}

    public EmptyGasTankException(String message) {
        super(message);
    }

    public EmptyGasTankException(String message, Throwable cause) {
        super(message, cause);
        getMessage();
        getCause();

    }

    public EmptyGasTankException(Throwable cause) {
        super(cause);
    }

    public EmptyGasTankException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    @Override
    public String getMessage(){
        return "No gas. Tank the transport";
    };
    @Override
    public Throwable getCause(){
        return null;
    };
}
