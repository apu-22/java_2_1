//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);

        scanner.close();
    }
}
