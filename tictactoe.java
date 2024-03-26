import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int position = scanner.nextInt();

        // Calculating row and column numbers
        int row = (position - 1) / 3;
        int column = (position - 1) % 3;

        // Output
        System.out.println(row + " " + column);

        scanner.close();
    }
}
