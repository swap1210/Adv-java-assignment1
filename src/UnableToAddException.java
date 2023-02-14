public class UnableToAddException extends Exception {
    public UnableToAddException(String errorClass) {
        super("Error adding more " + errorClass);
    }
}
