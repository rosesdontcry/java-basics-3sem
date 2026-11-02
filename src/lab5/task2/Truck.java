package lab5.task2;

import java.util.Objects;

public class Truck extends Vehicle {
    private double cargoCapacity;
    private String drivingCategory;

    public Truck(String brand, double maxSpeed, double mileage,
                 int enginePower, double cargoCapacity, String drivingCategory) {
        super(brand, maxSpeed, mileage, enginePower);
        this.cargoCapacity = cargoCapacity;
        this.drivingCategory = drivingCategory;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public String getDrivingCategory(){
        return drivingCategory;
    }

    private double categoryFactor(String category) {
        return switch (category) {
            case "B" -> 1.0;
            case "C" -> 3.0;
            case "D" -> 4.0;
            case "E" -> 6.0;
            default -> 2.0;
        };
    }

    @Override
    public double calculateFuelConsumption() {
        return (enginePower + cargoCapacity + categoryFactor(drivingCategory) + mileage) / 1000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nгрузоподъёмность: " + cargoCapacity + " т" +
                "\nкатегория прав: " + drivingCategory;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Truck other = (Truck) obj;
        return Double.compare(this.cargoCapacity, other.cargoCapacity) == 0 &&
                this.drivingCategory.equals(other.drivingCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoCapacity, drivingCategory);
    }

}
