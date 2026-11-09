package lab8.task1;

public abstract class SolidOfRevolution extends Shape {
    private final double radius;

    protected SolidOfRevolution(double radius) {
        this.radius = requirePositiveFinite(radius, "radius");
    }

    public double getRadius() {
        return radius;
    }
}
