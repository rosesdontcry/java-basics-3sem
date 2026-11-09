package lab8.task1;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * getRadius() * getRadius() * getRadius();
    }
}
