import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // My dashboard
        System.out.println("Welcome to my Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("Choice: ");

        int choice = scanner.nextInt();


        // Perform conversion
        if (choice == 1) {
            // Celsius to Fahrenheit
            System.out.println("Enter temperature in Celsius");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
             System.out.printf(celsius + " Celsius is " + fahrenheit + " Fahrenheit %n");
        } else if(choice == 2) {
            // Fahrenheit to Celsius
            System.out.println("Enter temperature in Fahrenheit");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf(fahrenheit + " Fahrenheit is " + celsius + " Celsius %n");
        } else {
            // Invalid choice
            System.out.println("Wrong choice. Start again and choose option 1 or 2");
        }

        System.out.println("Thank you for using my Temperature Converter!");
        // close the scanner
        scanner.close();
    }
}
