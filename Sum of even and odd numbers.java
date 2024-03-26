import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        int n = scanner.nextInt();

        // Declaring array to store the numbers
        int[] arr = new int[n];

        // Reading the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Closing the scanner
        scanner.close();

        // Calling function to find sum of even and odd numbers
        int[] sums = findSumOfEvenAndOdd(arr);

        // Printing the results
        System.out.println("The sum of the even numbers in the array is " + sums[0]);
        System.out.println("The sum of the odd numbers in the array is " + sums[1]);
    }

    // Function to find sum of even and odd numbers
    private static int[] findSumOfEvenAndOdd(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        return new int[]{sumEven, sumOdd};
    }
}
