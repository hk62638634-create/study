public class InvalidTestScoreException extends IllegalArgumentException {
    // Constructor with message
    public InvalidTestScoreException(String message) {
        super(message);
    }
    
    // Constructor with message and cause
    public InvalidTestScoreException(String message, Throwable cause) {
        super(message, cause);
    }
}