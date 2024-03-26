import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        int n = scanner.nextInt();

        // Print the hollow square pattern
        printHollowSquare(n);

        scanner.close();
    }

    public static void printHollowSquare(int n) {
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                // Print '*' for the first and last row, and for the first and last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else { // Print space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
