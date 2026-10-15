
import java.util.Scanner;

public class Practice4 {
    static abstract class Question {
        double points;

        Question(double points) {
            this.points = points;
        }

        abstract double grade(String answer);
    }

    static class MCQ extends Question {
        String correct;

        MCQ(double points, String correct) {
            super(points);
            this.correct = correct;
        }

        double grade(String answer) {
            return answer.equalsIgnoreCase(correct) ? points : 0;
        }
    }

    static class TrueFalse extends Question {
        String correct;

        TrueFalse(double points, String correct) {
            super(points);
            this.correct = correct;
        }

        double grade(String answer) {
            return answer.equalsIgnoreCase(correct) ? points : 0;
        }
    }

    static class Essay extends Question {
        String keywords;

        Essay(double points, String keywords) {
            super(points);
            this.keywords = keywords;
        }

        double grade(String answer) {
            int count = 0;

            for (String word : keywords.split(",")) {
                if (answer.toLowerCase().contains(
                        word.trim().toLowerCase())) {
                    count++;
                }
            }

            if (count >= 2) {
                return points * 0.75;
            } else if (count == 1) {
                return points * 0.50;
            }

            return 0;
        }
    }

    static String readQuoted(Scanner sc) {
        sc.skip("\\s*");
        sc.findInLine("\"([^\"]*)\"");
        return sc.match().group(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            readQuoted(sc); // Question text
            String correct = readQuoted(sc);
            String answer = readQuoted(sc);
            double points = sc.nextDouble();

            Question q;

            if (type.equals("MCQ")) {
                q = new MCQ(points, correct);
            } else if (type.equals("TF")) {
                q = new TrueFalse(points, correct);
            } else {
                q = new Essay(points, correct);
            }

            double score = q.grade(answer);

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
