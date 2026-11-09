package lab8.task1;

import java.util.ArrayList;

public class Box extends Shape {
    private final double volume;

    private final ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (volumesOfContainer() + shape.getVolume() <= this.volume && shape != this) {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    private double volumesOfContainer() {
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
}
