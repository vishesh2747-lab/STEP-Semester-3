
import java.util.Scanner;

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double getPower();

    boolean supportsSaver() {
        return false;
    }

    double calculateUnits(boolean saver) {
        double units = getPower() * hours / 1000;

        if (saver) {
            units = units * 0.75;
        }

        return units;
    }
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    double getPower() {
        return 150;
    }
}

class AC extends Appliance {
    AC(double hours) {
        super(hours);
    }

    double getPower() {
        return 1500;
    }

    boolean supportsSaver() {
        return true;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    double getPower() {
        return 100;
    }
}

class Washer extends Appliance {
    Washer(double hours) {
        super(hours);
    }

    double getPower() {
        return 500;
    }

    boolean supportsSaver() {
        return true;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Appliance[] appliances = new Appliance[n];
        String[] types = new String[n];
        boolean[] saver = new boolean[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double hours = sc.nextDouble();

            saver[i] = false;
            if (sc.hasNext("SAVER")) {
                sc.next();
                saver[i] = true;
            }

            if (types[i].equals("FRIDGE")) {
                appliances[i] = new Fridge(hours);
            } else if (types[i].equals("AC")) {
                appliances[i] = new AC(hours);
            } else if (types[i].equals("TV")) {
                appliances[i] = new TV(hours);
            } else {
                appliances[i] = new Washer(hours);
            }
        }

        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            Appliance a = appliances[i];

            if (saver[i] && !a.supportsSaver()) {
                System.out.println(
                    types[i] + ": saver mode not supported");
            } else {
                double units = a.calculateUnits(saver[i]);
                double cost = units * 8;

                System.out.printf(
                    "%s: Units=%.2f Cost=%.2f%n",
                    types[i], units, cost);

                totalCost += cost;
            }
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
