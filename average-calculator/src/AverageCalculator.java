import java.util.Scanner;

public class AverageCalculator {

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first grade:");
        double grade1 = scanner.nextDouble();

        System.out.println("Enter the second grade:");
        double grade2 = scanner.nextDouble();

        System.out.println("Enter the third grade:");
        double grade3 = scanner.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Average: "+ average);

        if (average >= 7.0){
            System.out.println("Status: Approved!");
        }else {
            System.out.println("Status: Failed.");
        }

    }
}