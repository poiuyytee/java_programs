import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        int number = scanner.nextInt();

        // Check if the number is a 3-digit number
        if (number >= 100 && number <= 999) {
            // Extract the middle digit
            int middleDigit = (number / 10) % 10;

            // Check if the middle digit is divisible by 3
            if (middleDigit % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        } else {
            System.out.println("Invalid Number");
        }

        scanner.close();
    }
}
