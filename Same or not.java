import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of arrays
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        
        // Check if sizes are the same
        if (size1 != size2) {
            System.out.println("Not Same");
            return;
        }
        
        // Input arrays
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // Calculate sum of arrays
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < size1; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        // Check if sums are the same
        if (sum1 == sum2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
        
        scanner.close();
    }
}
