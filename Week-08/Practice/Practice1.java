
import java.util.Scanner;

public class Practice1 {
    static abstract class Payment {
        double amount;

        Payment(double amount) {
            this.amount = amount;
        }

        abstract double calculateAmount();
        abstract String getType();
    }

    static class Card extends Payment {
        Card(double amount) {
            super(amount);
        }

        double calculateAmount() {
            return amount * 1.02;
        }

        String getType() {
            return "CARD";
        }
    }

    static class Wallet extends Payment {
        Wallet(double amount) {
            super(amount);
        }

        double calculateAmount() {
            return amount * 1.01;
        }

        String getType() {
            return "WALLET";
        }
    }

    static class BankTransfer extends Payment {
        BankTransfer(double amount) {
            super(amount);
        }

        double calculateAmount() {
            return amount;
        }

        String getType() {
            return "BANKTRANSFER";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Payment[] payments = new Payment[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            if (type.equals("CARD")) {
                payments[i] = new Card(amount);
            } else if (type.equals("WALLET")) {
                payments[i] = new Wallet(amount);
            } else {
                payments[i] = new BankTransfer(amount);
            }
        }

        double total = 0;

        for (Payment p : payments) {
            double adjustedAmount = p.calculateAmount();
            System.out.printf("%s: %.2f%n",
                    p.getType(), adjustedAmount);
            total += adjustedAmount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
