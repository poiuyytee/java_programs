import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int dollar1 = scanner.nextInt();
        int cent1 = scanner.nextInt();
        int dollar2 = scanner.nextInt();
        int cent2 = scanner.nextInt();

        // Adding dollars and cents
        int totalDollars = dollar1 + dollar2;
        int totalCents = cent1 + cent2;

        // Adjusting cents if it exceeds 100
        if (totalCents >= 100) {
            totalDollars += totalCents / 100;
            totalCents %= 100;
        }

        // Output
        System.out.println(totalDollars);
        System.out.println(totalCents);

        scanner.close();
    }
}
