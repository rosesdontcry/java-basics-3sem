package lab6.task2;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(double sum, double minAmount) {
        super("сумма " + sum + " меньше минимума(" + minAmount + ")");
    }
}
