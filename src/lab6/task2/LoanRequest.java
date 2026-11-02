package lab6.task2;

public class LoanRequest {
    private double sum;
    private int termMonths;

    public LoanRequest(double sum, int termMonths) {
        this.sum = sum;
        this.termMonths = termMonths;
    }

    public double getSum() {
        return sum;
    }

    public int getTermMonths() {
        return termMonths;
    }

    @Override
    public String toString(){
        return "LoanRequest{sum=" + sum + ", termMonths=" + termMonths + "}";
    }
}
