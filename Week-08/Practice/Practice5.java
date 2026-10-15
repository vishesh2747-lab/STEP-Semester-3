
import java.util.Scanner;

public class Practice5 {
    static abstract class Transport {
        double distance;

        Transport(double distance) {
            this.distance = distance;
        }

        abstract double calculateFare();
        abstract String getType();
    }

    static class Bus extends Transport {
        Bus(double distance) {
            super(distance);
        }

        double calculateFare() {
            return Math.min(2 + 0.10 * distance, 10);
        }

        String getType() {
            return "BUS";
        }
    }

    static class Train extends Transport {
        Train(double distance) {
            super(distance);
        }

        double calculateFare() {
            return 3 + 0.15 * distance;
        }

        String getType() {
            return "TRAIN";
        }
    }

    static class Metro extends Transport {
        double peakFactor;

        Metro(double distance, double peakFactor) {
            super(distance);
            this.peakFactor = peakFactor;
        }

        double calculateFare() {
            return (1.50 + 0.20 * distance) * peakFactor;
        }

        String getType() {
            return "METRO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Transport[] transports = new Transport[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            if (type.equals("BUS")) {
                transports[i] = new Bus(distance);
            } else if (type.equals("TRAIN")) {
                transports[i] = new Train(distance);
            } else {
                double peakFactor = sc.nextDouble();
                transports[i] = new Metro(distance, peakFactor);
            }
        }

        double total = 0;

        for (Transport t : transports) {
            double fare = t.calculateFare();
            System.out.printf("%s: %.2f%n",
                    t.getType(), fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
