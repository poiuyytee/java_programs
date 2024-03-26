import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the positive integer
        int number = scanner.nextInt();

        // Find and print prime numbers till the given positive number
        printPrimeNumbers(number);

        scanner.close();
    }

    public static void printPrimeNumbers(int n) {
        // 1 is not a prime number, so we start from 2
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
