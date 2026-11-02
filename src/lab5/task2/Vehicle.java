package lab5.task2;

import java.util.Objects;

public abstract class Vehicle {
    protected String brand;
    protected double maxSpeed;
    protected double mileage;
    protected int enginePower;

    public Vehicle(String brand, double maxSpeed,
                   double mileage, int enginePower) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public abstract double calculateFuelConsumption();

    @Override
    public String toString() {
        return "марка: " + brand +
                "\nмакс. скорость: " + maxSpeed + " км/ч" +
                "\nпробег: " + mileage + " км" +
                "\nмощность двигателя: " + enginePower + " л.с.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle) obj;
        return Double.compare(this.mileage, other.mileage) == 0 &&
                this.brand.equals(other.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, mileage);
    }
}
