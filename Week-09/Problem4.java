
import java.util.Scanner;

abstract class Cab {
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRate();

    double calculateFare() {
        return Math.max(100, km * getRate());
    }

    boolean supportsNightService() {
        return false;
    }

    double getFinalFare(String time) {
        double fare = calculateFare();

        if (time.equals("NIGHT")) {
            fare = fare * 1.20;
        }

        return fare;
    }
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double getRate() {
        return 10;
    }
}

class Sedan extends Cab {
    Sedan(double km) {
        super(km);
    }

    double getRate() {
        return 14;
    }

    boolean supportsNightService() {
        return true;
    }
}

class SUV extends Cab {
    SUV(double km) {
        super(km);
    }

    double getRate() {
        return 18;
    }

    boolean supportsNightService() {
        return true;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Cab[] cabs = new Cab[n];
        String[] types = new String[n];
        String[] times = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double km = sc.nextDouble();
            times[i] = sc.next();

            if (types[i].equals("MINI")) {
                cabs[i] = new Mini(km);
            } else if (types[i].equals("SEDAN")) {
                cabs[i] = new Sedan(km);
            } else {
                cabs[i] = new SUV(km);
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            Cab cab = cabs[i];

            if (times[i].equals("NIGHT")
                    && !cab.supportsNightService()) {
                System.out.println(
                    types[i] + ": night service not available");
            } else {
                double fare = cab.getFinalFare(times[i]);

                System.out.printf("%s: %.2f%n",
                        types[i], fare);
                total += fare;
            }
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
