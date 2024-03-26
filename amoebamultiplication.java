import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month index
        int monthIndex = scanner.nextInt();

        // Calculate and print the size of the amoeba
        int amoebaSize = calculateAmoebaSize(monthIndex);
        System.out.println(amoebaSize);

        scanner.close();
    }

    public static int calculateAmoebaSize(int monthIndex) {
        // Base cases for Fibonacci series
        if (monthIndex == 0)
            return 0;
        else if (monthIndex == 1 || monthIndex == 2)
            return 1;

        // Initialize variables for the Fibonacci series
        int prevPrev = 0;
        int prev = 1;
        int current = 1;

        // Calculate the Fibonacci series up to the given month index
        for (int i = 3; i <= monthIndex; i++) {
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }
}
