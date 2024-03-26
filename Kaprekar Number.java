import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        int number = scanner.nextInt();

        // Check if the number is a Kaprekar number
        if (isKaprekarNumber(number)) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }

        scanner.close();
    }

    public static boolean isKaprekarNumber(int num) {
        // Square the number
        long square = (long) num * num;

        // Calculate the number of digits in the square
        int numDigits = (int) Math.log10(square) + 1;

        // Split the square into two parts
        long divisor = (long) Math.pow(10, numDigits / 2);
        long rightPart = square % divisor;
        long leftPart = square / divisor;

        // Check if the sum of the parts is equal to the original number
        return (rightPart + leftPart) == num;
    }
}
