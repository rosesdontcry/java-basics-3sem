package lab7.task1;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super("Cтэк пуст");
    }
}
