import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Calculating number of hops
        int hops = Math.max(Math.abs(x - 3), Math.abs(y - 4));

        // Output
        System.out.println(hops);

        scanner.close();
    }
}
