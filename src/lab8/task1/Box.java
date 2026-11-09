package lab8.task1;

import java.util.ArrayList;
import java.util.Objects;

public class Box extends Shape {
    private final double volume;

    private final ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        this.volume = requirePositiveFinite(volume, "volume");
    }

    public boolean add(Shape shape) {
        Objects.requireNonNull(shape, "shape must not be null");
        if (shape == this) throw new IllegalArgumentException("box cannot contain itself");
        if (occupiedVolume() + shape.getVolume() <= this.volume) {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    private double occupiedVolume() {
        double volumes = 0;
        for (Shape shape : shapes) {
            volumes += shape.getVolume();
        }
        return volumes;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "Box:" +
                "volume=" + volume +
                "\n shapes{\n" + shapes +
                '}';
    }
}
