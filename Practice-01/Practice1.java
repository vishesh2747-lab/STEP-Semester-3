
import java.util.*;

public class Practice1 {
    static String playRound(String playerMove, String computerMove) {
        playerMove = playerMove.toLowerCase();
        computerMove = computerMove.toLowerCase();

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;
        int rounds = 5;

        System.out.println("Round | Player Move | Computer Move | Result");

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String player = sc.nextLine().trim();

            if (!player.equalsIgnoreCase("rock") &&
                !player.equalsIgnoreCase("paper") &&
                !player.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid move. Try again.");
                i--;
                continue;
            }

            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;

            System.out.println(i + " | " + player + " | " + computer + " | " + result);
        }

        double percentage = wins * 100.0 / rounds;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", percentage);

        sc.close();
    }
}
