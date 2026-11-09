package lab8.task1;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = requirePositiveFinite(s, "area");
        this.h = requirePositiveFinite(h, "height");
    }

    @Override
    public double getVolume() {
        return 1.0 / 3.0 * s * h;
    }
}
