import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.println("Ticket Type (VIP/Regular): ");
        String ticket = scanner.nextLine();

        System.out.println("Do you have parental permission? (yes/no): ");
        String authorization = scanner.nextLine().toLowerCase();

        if(age >= 18 && ticket.equalsIgnoreCase("VIP")){
            System.out.println("Access allowed!");
        } else if (age >= 18 && ticket.equalsIgnoreCase("Regular")) {
            System.out.println("Access allowed!");
        } else if (age >= 16 && ticket.equalsIgnoreCase("Regular") && authorization.equalsIgnoreCase("yes")) {
            System.out.println("Access allowed!");
        } else {
            System.out.println("Access denied.");
        }
      scanner.close();
    }
}