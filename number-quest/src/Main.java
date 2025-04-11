import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int mysteryNumber = random.nextInt(100) + 1;
        int remainingAttempts = 10;
        boolean gameActive = true;

        System.out.println("=== Number Quest ===");
        System.out.println("Try to guess the secret number between 1 and 100!");
        System.out.println("you have " + remainingAttempts + " attempts");

        while (gameActive && remainingAttempts > 0){

            System.out.println("Enter your guess (1-100):");
            int guess = scanner.nextInt();

            if (guess > mysteryNumber){
                System.out.println("Your guess is greater than the secret number.");
            } else if (guess < mysteryNumber) {
                System.out.println("Your guess is less than the secret number.");
            } else {
                System.out.println("Congratulations! You got it right!");
                gameActive = false;
            }

            remainingAttempts--;
            System.out.println("Remaining attempts: " + remainingAttempts);

            if (remainingAttempts == 0){
                System.out.println("You lost! The secret number was " + mysteryNumber);
            }
        }
    }
}