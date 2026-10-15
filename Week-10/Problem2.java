import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int presentDays = 0;
        int currentStreak = 0;
        int longestStreak = 0;

        for (int i = 0; i < n; i++) {
            int attendance = sc.nextInt();

            if (attendance == 1) {
                presentDays++;
                currentStreak++;

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Present: " + presentDays);
        System.out.println("Longest streak: " + longestStreak);

        sc.close();
    }
}