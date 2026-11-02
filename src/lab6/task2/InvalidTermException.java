package lab6.task2;

public class InvalidTermException extends Exception {
    public InvalidTermException(int termMonths, int minTerm) {
        super("кол-во месяцев " + termMonths + " меньше минимума(" + minTerm + ")");
    }
}
