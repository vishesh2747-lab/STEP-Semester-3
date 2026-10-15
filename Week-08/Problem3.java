
import java.util.Scanner;

public class Problem3 {
    static abstract class Room {
        protected int units;

        public Room(int units) {
            this.units = units;
        }

        public abstract double calculateBill();

        public abstract String getType();
    }

    static class SingleRoom extends Room {
        public SingleRoom(int units) {
            super(units);
        }

        public double calculateBill() {
            return units * 8.0;
        }

        public String getType() {
            return "SINGLE";
        }
    }

    static class SharedRoom extends Room {
        private int occupants;

        public SharedRoom(int units, int occupants) {
            super(units);
            this.occupants = occupants;
        }

        public double calculateBill() {
            return (units * 6.0) / occupants;
        }

        public String getType() {
            return "SHARED";
        }
    }

    static class AcRoom extends Room {
        public AcRoom(int units) {
            super(units);
        }

        public double calculateBill() {
            return units * 10.0 + 200;
        }

        public String getType() {
            return "AC";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Room[] rooms = new Room[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            if (type.equals("SINGLE")) {
                rooms[i] = new SingleRoom(units);
            } else if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                rooms[i] = new SharedRoom(units, occupants);
            } else {
                rooms[i] = new AcRoom(units);
            }
        }

        for (Room room : rooms) {
            double bill = room.calculateBill();
            System.out.printf("%s: %.2f%n",
                    room.getType(), bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
