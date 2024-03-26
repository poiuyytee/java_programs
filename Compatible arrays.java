import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size and elements of the first array
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        // Input size and elements of the second array
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // Check compatibility of the arrays
        if (n1 != n2) {
            System.out.println("Incompatible");
        } else {
            boolean compatible = true;
            for (int i = 0; i < n1; i++) {
                if (arr1[i] < arr2[i]) {
                    compatible = false;
                    break;
                }
            }
            if (compatible) {
                System.out.println("Compatible");
            } else {
                System.out.println("Incompatible");
            }
        }
        
        scanner.close();
    }
}
