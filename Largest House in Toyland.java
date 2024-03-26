import java.util.*;

public class LargestPlot {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of houses
        int N = scanner.nextInt();
        
        // Input the house numbers and positions
        int[][] houses = new int[N][2];
        for (int i = 0; i < N; i++) {
            houses[i][0] = scanner.nextInt(); // House number
            houses[i][1] = scanner.nextInt(); // Position
        }
        
        // Call the function to find the largest plot
        int[] largestPlot = findLargestPlot(houses);
        
        // Output the result
        System.out.println(largestPlot[0] + " " + largestPlot[1]);
        
        // Close the Scanner
        scanner.close();
    }
    
    public static int[] findLargestPlot(int[][] houses) {
        // Sort the houses based on their positions
        Arrays.sort(houses, Comparator.comparingInt(house -> house[1]));
        
        // Initialize variables to store the largest plot
        int largestGap = 0;
        int[] largestPlot = new int[2];
        
        // Iterate through the houses to find the largest gap
        for (int i = 1; i < houses.length; i++) {
            int gap = houses[i][1] - houses[i - 1][1];
            if (gap > largestGap) {
                largestGap = gap;
                largestPlot[0] = houses[i - 1][0];
                largestPlot[1] = houses[i][0];
            }
        }
        
        return largestPlot;
    }
}
