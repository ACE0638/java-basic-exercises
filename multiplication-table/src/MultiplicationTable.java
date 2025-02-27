import java.util.Scanner;

public class MultiplicationTable {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println();

        for (int i = 0; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "X" + i + "=" + result);
        }

    }
}
