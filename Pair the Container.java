import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of containers
        int numContainers = scanner.nextInt();
        
        // Input the container capacities
        int[] capacities = new int[numContainers];
        for (int i = 0; i < numContainers; i++) {
            capacities[i] = scanner.nextInt();
        }
        
        // Call the function to make pairs
        makePairs(capacities);
        
        // Close the Scanner
        scanner.close();
    }
    
    public static void makePairs(int[] capacities) {
        // Sort the container capacities
        Arrays.sort(capacities);
        
        // Print the pairs
        for (int i = 0, j = capacities.length - 1; i < j; i++, j--) {
            System.out.println(capacities[j] + " " + capacities[i]);
        }
        
        // If there is an odd number of containers
        if (capacities.length % 2 != 0) {
            System.out.println(capacities[capacities.length / 2] + " 0");
        }
    }
}
