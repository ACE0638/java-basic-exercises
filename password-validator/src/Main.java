import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rules:");
        System.out.println("1- At least 6 characters");
        System.out.println("2- at least 1 capital letter");
        System.out.println("3- at least 1 lowercase letter");
        System.out.println("4- At least 1 special character");
        System.out.println("5- At least 1 number");
        System.out.println("6- Do not contain blank spaces");
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isvalidpassword(password)) {
            System.out.print("Valid password!");
        } else {
            System.out.print("Invalid password");
        }

    }

    public static boolean isvalidpassword(String password) {
        if (password.length() < 6) {
            return false;
        } else if (!password.matches(".*[A-Z].*")) {
            return false;
        } else if (!password.matches(".*[a-z].*")) {
            return false;
        } else if (!password.matches(".*\\d.*")) {
            return false;
        } else if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            return false;
        } else {
            return !password.contains(" ");
        }
    }
}