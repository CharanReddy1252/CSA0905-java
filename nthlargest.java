import java.util.Arrays;
import java.util.Scanner;

public class nthlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size. Please enter a positive integer.");
            return;
        }

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the value of N
        System.out.print("Enter the value of N to find the Nth largest number: ");
        int N = scanner.nextInt();

        scanner.close();

        if (N <= 0 || N > size) {
            System.out.println("Invalid value of N. N should be between 1 and the array size.");
            return;
        }

        // Sort the array in descending order
        Arrays.sort(array);
        reverseArray(array);

        // Find and print the Nth largest number
        int nthLargest = array[N - 1];
        System.out.println("The " + N + "th largest number is: " + nthLargest);
    }

    // Function to reverse an array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
