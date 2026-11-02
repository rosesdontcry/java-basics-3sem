package lab6.task1;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c)
            throws IllegalTriangleException {
        if ((a + b) <= c) {
            throw new IllegalTriangleException(c, "c");
        }
        if (a + c <= b) {
            throw new IllegalTriangleException(b, "b");
        }
        if (b + c <= a) {
            throw new IllegalTriangleException(a, "a");
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }
}
