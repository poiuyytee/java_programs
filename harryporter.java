import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doorNumber = scanner.nextInt();
        int firstDigit = doorNumber / 1000;
        int lastDigit = doorNumber % 10;
        int sum = firstDigit + lastDigit;
        System.out.println(sum);
        scanner.close();
    }
}
