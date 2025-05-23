import java.util.*;
import java.text.DecimalFormat;

public class Main {
    private static final Map<String, Double> EXCHANGE_RATES = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("#.##");
    private static final List<String> conversionHistory  = new ArrayList<>();

    public static void main(String[] args) {
        initializeRates();
        runConverter();
    }

    private static void initializeRates() {
        EXCHANGE_RATES.put("USD", 1.0);
        EXCHANGE_RATES.put("EUR", 0.85);
        EXCHANGE_RATES.put("GBP", 0.73);
        EXCHANGE_RATES.put("JPY", 110.15);
        EXCHANGE_RATES.put("BRL", 5.30);

    }

    private static void runConverter() {
        while (true) {
            System.out.println("\n=== Currency Converter ===");
            System.out.println("1. Convert currency");
            System.out.println("2. View history");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int choice = getIntInput(1,3);

            switch (choice) {
                case 1: convertCurrency(); break;
                case 2: showHistory(); break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }

    private static void convertCurrency() {
        System.out.println("\nAvailable coins: " + EXCHANGE_RATES.keySet());

        System.out.print("Currency of origin: ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Destination currency: ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Value to convert: ");
        double amount  = scanner.nextDouble();

        if (!EXCHANGE_RATES.containsKey(fromCurrency) || !EXCHANGE_RATES.containsKey(toCurrency)) {
            System.out.println("Invalid currency");
            return;
        }

        double rate = EXCHANGE_RATES.get(toCurrency) / EXCHANGE_RATES.get(fromCurrency);
        double convertedAmount = amount * rate;

        String result = amount + " " + fromCurrency + " = " + df.format(convertedAmount) + " " + toCurrency;
        System.out.println(result);
        conversionHistory.add(result);
    }

    private static void showHistory() {
        if (conversionHistory.isEmpty()) {
            System.out.println("No conversions recorded");
            return;
        }

        System.out.println("\n=== historical ===");
        conversionHistory.forEach(System.out::println);
    }

    private static int getIntInput(int min , int max) {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input >= min && input <= max) return input;
                System.out.printf("Enter a number between %d and %d: \", min, max");
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number:");
                scanner.next();
            }
        }
    }

}