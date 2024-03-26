import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting number
        int n = scanner.nextInt();

        // Generate and print the Collatz sequence
        generateCollatzSequence(n);

        scanner.close();
    }

    public static void generateCollatzSequence(int n) {
        int count = 0;

        // Print the first term of the sequence
        System.out.println(n);

        // Apply the Collatz rule until the number becomes 1
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
            count++;
        }

        // Print the number of times the rule was applied
        System.out.println(""+ count);
    }
}
