package lab7.task1;

public class DuplicateElementException extends RuntimeException {
    public DuplicateElementException(Object element) {
        super("Элемент уже существует: " + element);
    }
}
