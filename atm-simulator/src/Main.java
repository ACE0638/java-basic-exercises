import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000;


        while(true){
            System.out.println("\n---ATM Simulator---");
            System.out.println("1- Check Balance");
            System.out.println("2- deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");
            System.out.println("Choose an option");

            if(scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.printf("Current balance: R$ %.2f%n", balance);
                        break;

                    case 2:
                        System.out.println("Enter the deposit amount:");
                        if (scanner.hasNextDouble()) {
                            double deposit = scanner.nextDouble();
                            scanner.nextLine();
                            if (deposit > 0) {
                                balance += deposit;
                                System.out.printf("Deposit successful! New balance: R$ %.2f%n", balance);
                            } else {
                                System.out.println("Invalid amount! Deposit must be positive.");
                            }
                        } else {
                            System.out.println("Invalid input! Numbers only.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        System.out.println("Enter the withdrawal amount:");
                        if (scanner.hasNextDouble()) {
                            double withdraw = scanner.nextDouble();
                            scanner.nextLine();
                            if (withdraw > 0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.printf("Withdrawal successful! New balance: R$ %.2f%n", balance);
                            } else {
                                System.out.println("Invalid amount or insufficient balance!");
                            }
                        } else {
                            System.out.println("Invalid input! Numbers only.");
                            scanner.next();
                        }
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option! Choose 1-4.");
                }

            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                scanner.nextLine();
            }
        }

    }
}