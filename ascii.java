import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input character
        char inputChar = scanner.next().charAt(0);

        // Get ASCII value
        int asciiValue = (int) inputChar;

        // Print the ASCII value
        System.out.println(asciiValue);

        // Close the Scanner
        scanner.close();
    }
}
