import java.util.Scanner;

public class FenceAndCarpet {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input length and breadth of the ground
        System.out.println("Enter the length of the ground:");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the ground:");
        int breadth = scanner.nextInt();
        
        // Calculate requirements
        int[] requirements = calculateRequirements(length, breadth);
        
        // Output
        System.out.println("The required length is " + requirements[0] + " m");
        System.out.println("The required area of carpet is " + requirements[1] + " sqm");
        
        // Close the Scanner
        scanner.close();
    }
    
    public static int[] calculateRequirements(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        int[] requirements = {perimeter, area};
        return requirements;
    }
}
