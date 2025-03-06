import java.util.Scanner;

public class TemperatureConverter {

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((celsius * 9 / 5) + 32);

        System.out.println(celsius + "ºC is equivalent to " + fahrenheit +"ºF" );

        scanner.close();

    }


}
