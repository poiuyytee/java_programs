import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Flipkart details
        int flipkartPrice = scanner.nextInt();
        int flipkartDiscount = scanner.nextInt();
        int flipkartShipping = scanner.nextInt();

        // Input: Snapdeal details
        int snapdealPrice = scanner.nextInt();
        int snapdealDiscount = scanner.nextInt();
        int snapdealShipping = scanner.nextInt();

        // Input: Amazon details
        int amazonPrice = scanner.nextInt();
        int amazonDiscount = scanner.nextInt();
        int amazonShipping = scanner.nextInt();

        // Calculate effective prices after discount and shipping charges
        int flipkartFinalPrice = flipkartPrice - flipkartPrice * flipkartDiscount / 100 + flipkartShipping;
        int snapdealFinalPrice = snapdealPrice - snapdealPrice * snapdealDiscount / 100 + snapdealShipping;
        int amazonFinalPrice = amazonPrice - amazonPrice * amazonDiscount / 100 + amazonShipping;

        // Output the prices on each website
        System.out.println("In Flipkart: Rs." + flipkartFinalPrice);
        System.out.println("In Snapdeal: Rs." + snapdealFinalPrice);
        System.out.println("In Amazon: Rs." + amazonFinalPrice);

        // Choose the website with the lowest price
        if (flipkartFinalPrice <= snapdealFinalPrice && flipkartFinalPrice <= amazonFinalPrice) {
            if (flipkartFinalPrice == snapdealFinalPrice || flipkartFinalPrice == amazonFinalPrice) {
                System.out.println("Choose Flipkart");
            } else {
                System.out.println("Choose Flipkart");
            }
        } else if (snapdealFinalPrice <= amazonFinalPrice) {
            if (snapdealFinalPrice == amazonFinalPrice) {
                System.out.println("Choose Snapdeal");
            } else {
                System.out.println("Choose Snapdeal");
            }
        } else {
            System.out.println("Choose Amazon");
        }

        scanner.close();
    }
}
