package lab8.task1;

public abstract class Shape {
    public abstract double getVolume();

    protected static double requirePositiveFinite(double value, String name) {
        if (!(value > 0)) throw new IllegalArgumentException(name + " must be positive " + value);
        return value;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{volume= " + getVolume() + "}\n";
    }
}
