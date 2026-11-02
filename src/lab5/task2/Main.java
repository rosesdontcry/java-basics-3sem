package lab5.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("Toyota Camry", 210, 45000, 180, 4, 480));
        fleet.add(new Car("Lada Vesta", 190, 120000, 106, 4, 480));
        fleet.add(new Truck("Volvo FH", 130, 350000, 460, 20, "E"));
        fleet.add(new Truck("Газель", 120, 90000, 120, 1.5, "B"));

        double totalMileage = 0;

        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle.toString());
            System.out.printf("Расход топлива: %.2f л/100км%n",
                    vehicle.calculateFuelConsumption());

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Это легковой автомобиль. \nдверей: " +
                        car.getNumberOfDoors() + "\nбагажник: " + car.getTrunkVolume() + " л");
                System.out.println("---------------------------------------");
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Это грузовик. \nгрузоподъёмность: " +
                        truck.getCargoCapacity() + " т \nкатегория прав: " +
                        truck.getDrivingCategory());
            }

            totalMileage += vehicle.getMileage();

        }

        System.out.printf("Общий пробег: %.1f км%n%n", totalMileage);


        Car camryDuplicate = new Car("Toyota Camry", 210, 45000, 180, 4, 480);
        Car camryOriginal = (Car) fleet.get(0);

        System.out.println("?? " + camryOriginal.equals(camryDuplicate));

        Car camryDifferentDoors = new Car("Toyota Camry", 210, 45000, 180, 2, 480);
        System.out.println("?? " + camryOriginal.equals(camryDifferentDoors)); // false

        Truck fakeTruck = new Truck("Toyota Camry", 210, 45000, 180, 10, "C");
        System.out.println("?? " + camryOriginal.equals(fakeTruck)); // false
    }
}