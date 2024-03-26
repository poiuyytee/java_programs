import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        int number = scanner.nextInt();

        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sumOfFactorials = 0;

        // Calculate the sum of factorials of individual digits
        while (num != 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        // Check if the sum of factorials is equal to the original number
        return sumOfFactorials == originalNumber;
    }

    public static int factorial(int n) {
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Calculate factorial recursively
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
