
import java.util.Scanner;

public class Problem4 {
    static abstract class Employee {
        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public abstract double calculateBonus();
    }

    static class FullTime extends Employee {
        public FullTime(String name, double salary) {
            super(name, salary);
        }

        public double calculateBonus() {
            return salary * 0.10;
        }
    }

    static class PartTime extends Employee {
        public PartTime(String name, double salary) {
            super(name, salary);
        }

        public double calculateBonus() {
            return salary * 0.05;
        }
    }

    static class Intern extends Employee {
        public Intern(String name, double salary) {
            super(name, salary);
        }

        public double calculateBonus() {
            return 2000;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equals("FULLTIME")) {
                employees[i] = new FullTime(name, salary);
            } else if (type.equals("PARTTIME")) {
                employees[i] = new PartTime(name, salary);
            } else {
                employees[i] = new Intern(name, salary);
            }
        }

        for (Employee employee : employees) {
            double bonus = employee.calculateBonus();
            System.out.printf("%s: %.2f%n",
                    employee.name, bonus);
            total += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}
