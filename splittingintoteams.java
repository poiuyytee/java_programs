import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int totalFriends = scanner.nextInt();
        int numTeams = scanner.nextInt();

        // Calculation
        int friendsPerTeam = totalFriends / numTeams;
        int leftOut = totalFriends % numTeams;

        // Output
        System.out.println("The number of friends in each team is " + friendsPerTeam + " and left out is " + leftOut);

        scanner.close();
    }
}
