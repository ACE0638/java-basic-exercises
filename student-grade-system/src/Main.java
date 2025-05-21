import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        double[] scores = getScores(scanner);

        double average = calculateAverage(scores);

        char grade = covertToGrade(average);

        printReport(name, scores, average, grade);
    }
    public static double[] getScores(Scanner scanner){
        double[] scores = new double[3];
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.printf("Enter score %d (0-100):", i+1);

                try {
                    scores[i] = Double.parseDouble(scanner.nextLine());
                    if (scores[i] < 0 || scores[i] > 100) {
                        System.out.println("Error: Score must be 0-100");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input . Please enter  a number");
                }
            }
        }
        return scores;
    }

    public static  double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores){
             sum += score;
        }
        return sum/ scores.length;
    }

    public static char covertToGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    public static void printReport(String name, double[] scores, double average, char grade){
        System.out.println("\n--- Student Report ---");
        System.out.printf("Student: %s\n" , name);

        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("- Test %d: %.1f\n", i+1, scores[i]);
        }

        System.out.printf("\nAverage: %.1f\n", average);
        System.out.printf("Letter Grade: %c\n", grade);
        System.out.printf("Status: %s\n", grade <= 'D' ? "Passed" : "Failed");
    }
}