import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the limits m and n
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Find and print special numbers between m and n
        findSpecialNumbers(m, n);

        scanner.close();
    }

    public static void findSpecialNumbers(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (isSpecialNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSpecialNumber(int num) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        // Extract digits and calculate sum and product
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        // Check if sum of digits and product of digits equal to the number
        return (sumOfDigits + productOfDigits) == num;
    }
}
