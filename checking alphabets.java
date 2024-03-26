import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        char ch = scanner.next().charAt(0);

        // Checking if the character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Converting to lowercase for easier comparison
            ch = Character.toLowerCase(ch);
            
            // Checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            // Not an alphabet
            System.out.println("Not an alphabet");
        }

        scanner.close();
    }
}
