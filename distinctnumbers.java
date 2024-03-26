import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        int size = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Count distinct elements using HashSet
        Set<Integer> distinctElements = new HashSet<>();
        for (int i = 0; i < size; i++) {
            distinctElements.add(arr[i]);
        }
        
        // Output the number of distinct elements
        System.out.println("There are " + distinctElements.size() + " distinct element in the array.");
        
        scanner.close();
    }
}
