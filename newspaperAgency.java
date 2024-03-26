import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int copiesSold = scanner.nextInt();
        int costPerCopy = scanner.nextInt();
        int costPerCopyPrinting = scanner.nextInt();
        int profit = (copiesSold * costPerCopy) - (copiesSold * costPerCopyPrinting) - 100;

        System.out.println(profit);
        scanner.close();
    }
}
