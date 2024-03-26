import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Month, Room rent per day, Number of days stayed
        int month = scanner.nextInt();
        int roomRent = scanner.nextInt();
        int daysStayed = scanner.nextInt();

        // Array to store the months during peak season
        int[] peakSeasonMonths = {4, 5, 6, 11, 12};

        // Checking if the month value is valid (ranging from 1 to 12)
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {
            // Checking if the month falls within the peak season
            boolean isPeakSeason = false;
            for (int peakMonth : peakSeasonMonths) {
                if (month == peakMonth) {
                    isPeakSeason = true;
                    break;
                }
            }

            // Calculating the hotel tariff
            int tariff;
            if (isPeakSeason) {
                // Room rent is 20% higher during peak seasons
                tariff = roomRent * daysStayed * 120 / 100;
            } else {
                tariff = roomRent * daysStayed;
            }

            // Output the hotel tariff
            System.out.println(tariff);
        }

        scanner.close();
    }
}
