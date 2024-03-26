import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of groups and bus capacity
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input number of people in each group
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = scanner.nextInt();
        }

        // Calculate the number of buses needed
        int buses = calculateBuses(groups, m);

        // Output
        System.out.println(buses);

        scanner.close();
    }

    public static int calculateBuses(int[] groups, int m) {
        int buses = 0;
        int currentCapacity = 0;

        for (int i = 0; i < groups.length; i++) {
            if (currentCapacity + groups[i] <= m) {
                currentCapacity += groups[i];
            } else {
                buses++;
                currentCapacity = groups[i];
            }
        }

        // If there are remaining people, another bus is needed
        if (currentCapacity > 0) {
            buses++;
        }

        return buses;
    }
}
