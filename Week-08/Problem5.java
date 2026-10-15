
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem5 {
    static abstract class Plan {
        protected String name;
        protected LocalDate startDate;

        public Plan(String name, String startDate) {
            this.name = name;
            this.startDate = LocalDate.parse(startDate);
        }

        public abstract int getValidity();

        public LocalDate getRenewalDate() {
            return startDate.plusDays(getValidity());
        }
    }

    static class Basic extends Plan {
        public Basic(String name, String startDate) {
            super(name, startDate);
        }

        public int getValidity() {
            return 30;
        }
    }

    static class Standard extends Plan {
        public Standard(String name, String startDate) {
            super(name, startDate);
        }

        public int getValidity() {
            return 90;
        }
    }

    static class Premium extends Plan {
        public Premium(String name, String startDate) {
            super(name, startDate);
        }

        public int getValidity() {
            return 365;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Plan[] plans = new Plan[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String date = sc.next();

            if (type.equals("BASIC")) {
                plans[i] = new Basic(name, date);
            } else if (type.equals("STANDARD")) {
                plans[i] = new Standard(name, date);
            } else {
                plans[i] = new Premium(name, date);
            }
        }

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (Plan plan : plans) {
            System.out.println(plan.name + ": " +
                    plan.getRenewalDate().format(formatter));
        }

        sc.close();
    }
}
