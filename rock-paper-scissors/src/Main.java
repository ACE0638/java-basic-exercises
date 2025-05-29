import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};

        System.out.println("=== Rock-PAPER-SCISSORS GAME ===");
        System.out.println("Best of 3  rounds. let's begin!\n");

        int playerScore = 0;
        int computerScore = 0;

        while (playerScore < 2 && computerScore < 2) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Your choice: ");

            int playerChoice = getPlayerChoice(scanner);
            String playerMove = choices[playerChoice -1];

            int computerChoice = random.nextInt(3) + 1;
            String computerMove = choices[computerChoice -1];

            System.out.println("\nYou chose: " + playerMove);
            System.out.println("\nComputer chose: " + computerMove);

            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);

            if (result.contains("WIN")) {
                playerScore++;
            } else if (result.contains("LOSE")) {
                computerScore++;
            }

            System.out.println("\nScore - You: " + playerScore + " | Computer: " + computerScore);
            System.out.println("-----------------------------------------");
        }

        System.out.println("\n=== FINAL RESULTS===");
        if (playerScore > computerScore) {
            System.out.println("Your win!");
        } else {
            System.out.println("Computer win!");
        }

        scanner.close();
    }

    private static int getPlayerChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }
                System.out.print("invalid choice");
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number");
            }
        }
    }

    private static String determineWinner(int player, int computer) {
        if (player == computer) {
            return "It's a TIE";
        }
        switch (player) {
            case 1:
                return (computer == 3) ? "ROCK crushes SCISSORS. You WIN" : "PAPER covers ROCK. You LOSE";
            case 2:
                return (computer == 1) ? "PAPER covers ROCK. You WIN" : "SCISSORS cut PAPER. You LOSE";
            case 3:
                return (computer == 2) ? "SCISSORS cut PAPER. You WIN" : "ROCK crushes SCISSORS. You LOSE";
            default:
                return "";
        }
    }
}