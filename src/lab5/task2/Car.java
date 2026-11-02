package lab5.task2;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double trunkVolume;

    public Car(String brand, double maxSpeed, double mileage,
               int enginePower, int numberOfDoors, double trunkVolume) {
        super(brand, maxSpeed, mileage, enginePower);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolume = trunkVolume;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getTrunkVolume() {
        return trunkVolume;
    }

    @Override
    public double calculateFuelConsumption() {
        return (enginePower + trunkVolume + numberOfDoors + mileage) / 1000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nколичество дверей: " + numberOfDoors +
                "\nобъём багажника: " + trunkVolume + " л";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Car other = (Car) obj;
        return this.numberOfDoors == other.numberOfDoors &&
                Double.compare(this.trunkVolume, other.trunkVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors, trunkVolume);
    }
}
