import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String resultString = removeVowels(inputString);

        System.out.println("The string without vowels is: " + resultString);

        scanner.close();
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the current character is not a vowel (both uppercase and lowercase).
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' &&
                currentChar != 'o' && currentChar != 'u' &&
                currentChar != 'A' && currentChar != 'E' && currentChar != 'I' &&
                currentChar != 'O' && currentChar != 'U') {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
