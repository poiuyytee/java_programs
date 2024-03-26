import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input float value
        float inputValue = scanner.nextFloat();

        // Round up and down using ceil() and floor() functions
        int roundedDown = (int) Math.floor(inputValue);
        int roundedUp = (int) Math.ceil(inputValue);

        // Print the results
        System.out.println(roundedDown);
        System.out.println(roundedUp);
        System.out.println((int) inputValue);  // Casting inputValue to int for rounding towards zero

        // Close the Scanner
        scanner.close();
    }
}
