import java.util.Scanner;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the list
        int N = scanner.nextInt();
        
        // Input the elements of the list
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Call the function to segregate even and odd numbers
        segregateEvenOdd(arr);
        
        // Output the result
        System.out.println("Array after Segregation");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Close the Scanner
        scanner.close();
    }
    
    public static void segregateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Move left pointer until it points to an odd number
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            
            // Move right pointer until it points to an even number
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            
            // Swap arr[left] and arr[right]
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
