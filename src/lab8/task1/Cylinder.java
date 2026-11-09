package lab8.task1;

public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = requirePositiveFinite(height, "height");
    }

    @Override
    public double getVolume() {
        return  Math.PI * getRadius() * getRadius() * height;
    }
}
