import java.util.Scanner;

public class EvenNumbersInRange {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Even numbers between " + start + " and " + end);

        for (int i =  start; i <=  end; i++){
            if(i % 2 == 0)  {
                System.out.print(i);

                if(i < end - 1){
                System.out.print(", ");

            }

            }
        }
        scanner.close();
    }
}
