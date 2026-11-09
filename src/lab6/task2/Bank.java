package lab6.task2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final double MIN_AMOUNT = 1000;
    private static final int MIN_TERM = 6;
    private List<LoanRequest> loans = new ArrayList<>();

    public void approveLoan(LoanRequest loan)
            throws InvalidAmountException, InvalidTermException {
        if (loan.getSum() < MIN_AMOUNT)
            throw new InvalidAmountException(loan.getSum(), MIN_AMOUNT);
        if (loan.getTermMonths() < MIN_TERM)
            throw new InvalidTermException(loan.getTermMonths(), MIN_TERM);
        loans.add(loan);
    }

    public int size() {
        return loans.size();
    }
}
