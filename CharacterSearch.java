import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to be searched: ");
        char targetChar = scanner.next().charAt(0);

        int index = -1; // Initialize index to -1, indicating that the character was not found initially.

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                index = i;
                break; // Exit the loop when the character is found.
            }
        }

        if (index != -1) {
            System.out.println(targetChar + " is found in the string at index: " + index);
        } else {
            System.out.println(targetChar + " is not found in the string.");
        }

        scanner.close();
    }
}
