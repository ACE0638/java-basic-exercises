import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a word/phrase: ");
       String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Invertido: " + reversed);
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}