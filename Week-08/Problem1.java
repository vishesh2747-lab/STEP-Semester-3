
import java.util.Scanner;

public class Problem1 {
    static abstract class Customer {
        protected double amount;

        public Customer(double amount) {
            this.amount = amount;
        }

        public abstract double calculateAmount();

        public abstract String getType();
    }

    static class Student extends Customer {
        public Student(double amount) {
            super(amount);
        }

        public double calculateAmount() {
            return amount * 0.90;
        }

        public String getType() {
            return "STUDENT";
        }
    }

    static class Staff extends Customer {
        public Staff(double amount) {
            super(amount);
        }

        public double calculateAmount() {
            return amount * 0.95;
        }

        public String getType() {
            return "STAFF";
        }
    }

    static class Guest extends Customer {
        public Guest(double amount) {
            super(amount);
        }

        public double calculateAmount() {
            return amount + 10;
        }

        public String getType() {
            return "GUEST";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer[] customers = new Customer[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            if (type.equals("STUDENT")) {
                customers[i] = new Student(amount);
            } else if (type.equals("STAFF")) {
                customers[i] = new Staff(amount);
            } else {
                customers[i] = new Guest(amount);
            }
        }

        for (Customer customer : customers) {
            double finalAmount = customer.calculateAmount();
            System.out.printf("%s: %.2f%n",
                    customer.getType(), finalAmount);
            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
