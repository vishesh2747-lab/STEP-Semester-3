
import java.util.Scanner;

public class Problem2 {
    static abstract class Vehicle {
        protected int hours;

        public Vehicle(int hours) {
            this.hours = hours;
        }

        public abstract double calculateCharge();

        public abstract String getType();
    }

    static class Bike extends Vehicle {
        public Bike(int hours) {
            super(hours);
        }

        public double calculateCharge() {
            return hours * 10.0;
        }

        public String getType() {
            return "BIKE";
        }
    }

    static class Car extends Vehicle {
        public Car(int hours) {
            super(hours);
        }

        public double calculateCharge() {
            return 30 + (hours - 1) * 20.0;
        }

        public String getType() {
            return "CAR";
        }
    }

    static class Truck extends Vehicle {
        public Truck(int hours) {
            super(hours);
        }

        public double calculateCharge() {
            return Math.max(100, hours * 50.0);
        }

        public String getType() {
            return "TRUCK";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();

            if (type.equals("BIKE")) {
                vehicles[i] = new Bike(hours);
            } else if (type.equals("CAR")) {
                vehicles[i] = new Car(hours);
            } else {
                vehicles[i] = new Truck(hours);
            }
        }

        for (Vehicle vehicle : vehicles) {
            double charge = vehicle.calculateCharge();
            System.out.printf("%s: %.2f%n",
                    vehicle.getType(), charge);
            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
