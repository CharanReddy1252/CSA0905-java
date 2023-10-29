import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;

        System.out.println("Enter characters (type '*' to end):");

        while (true) {
            inputChar = scanner.next().charAt(0);

            if (inputChar == '*') {
                break; // Exit the loop when a '*' is encountered.
            }

            if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                numberCount++;
            }
        }

        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Number count: " + numberCount);

        scanner.close();
    }
}
