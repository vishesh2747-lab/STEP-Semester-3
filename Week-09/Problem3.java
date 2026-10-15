
import java.util.Scanner;

abstract class Student {
    String name;
    double tuition;

    Student(String name, double tuition) {
        this.name = name;
        this.tuition = tuition;
    }

    abstract double calculateFee();

    boolean usesBus() {
        return false;
    }

    double getTransportFee() {
        return usesBus() ? 12000 : 0;
    }
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name, 40000);
    }

    boolean usesBus() {
        return true;
    }

    double calculateFee() {
        return tuition + getTransportFee();
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name, 40000);
    }

    double calculateFee() {
        return tuition + 60000;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name, 20000);
    }

    boolean usesBus() {
        return true;
    }

    double calculateFee() {
        return tuition + getTransportFee();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            if (type.equals("DAY_SCHOLAR")) {
                students[i] = new DayScholar(name);
            } else if (type.equals("HOSTELLER")) {
                students[i] = new Hosteller(name);
            } else {
                students[i] = new Scholar(name);
            }
        }

        double total = 0;

        for (Student s : students) {
            double fee = s.calculateFee();
            System.out.printf("%s: %.2f%n", s.name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
