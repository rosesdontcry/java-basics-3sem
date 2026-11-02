package lab6.task1;

public class IllegalTriangleException extends Exception{
    private final String sideName;
    private final double invalidValue;

    public IllegalTriangleException(double invalidValue, String sideName) {
        super(sideName + " = " + invalidValue + " маловат");
        this.sideName = sideName;
        this.invalidValue = invalidValue;
    }

    public String getSideName() {
        return sideName;
    }

    public double getInvalidValue() {
        return invalidValue;
    }
}
