import java.util.Scanner;

public class VowelCounter {

    public void start () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        System.out.println("The word/phrase \"" + input + "\" has " + vowelCount + " vowels.");
        scanner.close();
    }
}