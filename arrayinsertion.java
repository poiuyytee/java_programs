import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int position = scanner.nextInt();
        int element = scanner.nextInt();

        // Call the function to insert the element
        insertElement(arrSize, arr, position, element);
    }

    // Function to insert an element at a specific position in an array
    public static void insertElement(int arrSize, int[] arr, int position, int element) {
        // Check if the position is valid
        if (position > arrSize || position < 1) {
            System.out.println("Invalid Input");
            return;
        }

        // Create a new array to accommodate the inserted element
        int[] newArr = new int[arrSize + 1];

        // Copy elements up to the insertion position
        for (int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }

        // Insert the element
        newArr[position - 1] = element;

        // Copy the remaining elements
        for (int i = position; i <= arrSize; i++) {
            newArr[i] = arr[i - 1];
        }

        // Print the array after insertion
        System.out.println("Array after insertion is");
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}

