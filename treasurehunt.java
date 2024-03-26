import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int goldCoins = scanner.nextInt();
        int benSharePercentage = scanner.nextInt();
        int blackbeardSharePercentage = scanner.nextInt();

        // Calculating Long Ben's share
        int benShare = (goldCoins * benSharePercentage) / 100;

        // Calculating Blackbeard's share
        int remainingGoldCoins = goldCoins - benShare;
        int blackbeardShare = (remainingGoldCoins * blackbeardSharePercentage) / 100;

        // Calculating remaining shares for other pirates
        int remainingShares = remainingGoldCoins - blackbeardShare;

        // Output
        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(remainingShares / 3);

        scanner.close();
    }
}
