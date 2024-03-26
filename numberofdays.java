import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read year and month from input
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        // Check if the given year is within the range
        if (year < 1900 || year > 9999) {
            System.out.println("0");
        } else {
            // Calculate the number of days in the given month and year
            int numDays = getNumberOfDays(year, month);
            System.out.println(numDays + " Days");
        }

        scanner.close();
    }

    public static int getNumberOfDays(int year, int month) {
        // Array to store the number of days in each month
        int[] daysInMonth = {
            31, // January
            (isLeapYear(year) ? 29 : 28), // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
        };

        // Return the number of days for the given month
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        // Leap year condition: divisible by 4 but not divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
