import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\n=== BMI calculator ===");

        System.out.print("Enter your weight in kg: ");
        double wieght = getValidDouble(scanner);

        System.out.print("Enter your height in meters: ");
        double height = getValidDouble(scanner);

        double bmi = calculateBMI(wieght, height);
        String category = classifyBMI(bmi);

        System.out.println("\n=== RESULTS ===");
        System.out.println("Your BMI: " + df.format(bmi));
        System.out.println("category: " + category);

        scanner.close();
    }

    public static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine().replace(",","."));
                if (value > 0) {
                    return value;
                }
                System.out.print("Invalid value");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input");
            }

        }
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "overweight";
        } else if (bmi < 35) {
            return "Obesity Class I";
        } else if (bmi < 40) {
            return "Obesity Class II";
        } else {
            return "Obesity Class III(Morbid)";
        }
    }
}