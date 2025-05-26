import java.util.Scanner;

public class Main {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 !?.,";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Caeser Cipher Tool ===");
        System.out.println("1. Encrypt text");
        System.out.println("2. Decrypt text");
        System.out.print("3. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter text to encrypt:");
                String plaintext = scanner.nextLine();
                System.out.print("Enter shift value (1-66): ");
                int encryptShift = scanner.nextInt();
                System.out.println("Encrypted: " + encrypt(plaintext, encryptShift));
                break;
            case 2:
                System.out.print("Enter text to decrypt: ");
                String ciphertext = scanner.nextLine();
                System.out.print("Enter shift value (1-66): ");
                int decryptShift = scanner.nextInt();
                System.out.println("Decrypted: " + decrypt(ciphertext, decryptShift));
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }

    public static String encrypt(String text, int shift) {
        shift = shift % ALPHABET.length();
        StringBuilder encrypted = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int newIndex = (index + shift) % ALPHABET.length();
                encrypted.append(ALPHABET.charAt(newIndex));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int shift) {
        shift = shift % ALPHABET.length();
        StringBuilder decrypt = new StringBuilder();

        for(char c :text.toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int newIndex = (index - shift + ALPHABET.length()) % ALPHABET.length();
                decrypt.append(ALPHABET.charAt(newIndex));
            } else {
                decrypt.append(c);
            }
        }
        return decrypt.toString();
    }
}