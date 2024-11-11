package tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Make a choice: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double inputTemperature = scanner.nextDouble();
        double result;
        if (choice == 1) {
            result = converter.celsiusToFahrenheit(inputTemperature);
            System.out.println("Converted temperature: " + result + " °F");
        } else if (choice == 2) {
            result = converter.fahrenheitToCelsius(inputTemperature);
            System.out.println("Converted temperature: " + result + " °F");
        } else {
            System.out.println("Incorrect selection!");
        }
    }
}