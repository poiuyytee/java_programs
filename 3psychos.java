import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculating midpoint
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;

        // Output
        System.out.printf("Arun's house is located at(%.1f,%.1f)\n", midX, midY);

        scanner.close();
    }
}
