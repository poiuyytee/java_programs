import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double years = scanner.nextDouble();

        // Calculating interest
        double interest = (principal * rate * years) / 100;
        interest = Math.round(interest * 100.0) / 100.0; // rounding off to two decimal places

        // Calculating total amount
        double amount = principal + interest;
        amount = Math.round(amount * 100.0) / 100.0; // rounding off to two decimal places

        // Calculating discount
        double discount = 0.02 * interest;
        discount = Math.round(discount * 100.0) / 100.0; // rounding off to two decimal places

        // Calculating final settlement
        double finalSettlement = amount - discount;
        finalSettlement = Math.round(finalSettlement * 100.0) / 100.0; // rounding off to two decimal places

        // Output
        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n", amount);
        System.out.printf("%.2f\n", discount);
        System.out.printf("%.2f\n", finalSettlement);

        scanner.close();
    }
}
