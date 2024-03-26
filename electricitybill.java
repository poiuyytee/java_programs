import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int unitsConsumed = scanner.nextInt();

        // Calculate electricity bill
        int bill = calculateBill(unitsConsumed);

        // Output
        System.out.println("Rs." + bill);

        scanner.close();
    }

    // Function to calculate electricity bill
    public static int calculateBill(int units) {
        int bill = 0;
        if (units <= 200) {
            bill = (int) (0.5 * units);
        } else if (units <= 400) {
            bill = (int) (0.65 * units) + 100;
        } else if (units <= 600) {
            bill = (int) (0.80 * units) + 200;
        } else {
            bill = (int) (1.25 * units) + 425;
        }
        return bill;
    }
}
