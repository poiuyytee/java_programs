import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        int number = scanner.nextInt();

        // Find the sum of digits until it becomes a single digit
        int result = findSingleDigitSum(number);
        System.out.println(result);

        scanner.close();
    }

    public static int findSingleDigitSum(int num) {
        // If the number is already a single digit, return it
        if (num < 10) {
            return num;
        }

        // Calculate the sum of digits
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        // Recursively find the sum of digits until it becomes a single digit
        return findSingleDigitSum(sum);
    }
}
