import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of pattern rows
        int rows = scanner.nextInt();

        // Print the inverted right-angled triangle pattern
        printInvertedRightAngledTriangle(rows);

        scanner.close();
    }

    public static void printInvertedRightAngledTriangle(int rows) {
        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
