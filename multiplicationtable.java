import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n and m
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter m");
        int m = scanner.nextInt();

        // Print the multiplication table
        printMultiplicationTable(n, m);

        scanner.close();
    }

    public static void printMultiplicationTable(int n, int m) {
        // Print the header
        System.out.println("The multiplication table of " + n + " is");

        // Print the table
        for (int i = 1; i <= m; i++) {
            System.out.println(i + "*" + n + "=" + (i * n));
        }
    }
}
