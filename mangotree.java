import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();

        // Checking if the tree number denotes a mango tree
        String result = checkMangoTree(rows, columns, treeNumber);

        // Outputting result
        System.out.println(result);

        scanner.close();
    }

    public static String checkMangoTree(int rows, int columns, int treeNumber) {
        // Check if the tree number is in the first row, first column, or last column
        if (treeNumber <= columns || treeNumber % columns == 1 || treeNumber % columns == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
