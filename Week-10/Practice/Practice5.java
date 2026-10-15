import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int reversed = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Digit sum: " + sum);
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}