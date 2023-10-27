import java.util.Scanner;

public class lcmgcdcalc {
    // Function to calculate GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers
    public static int calculateLCM(int a, int b) {
        return (a*b)/calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        int[] numbers = new int[n];
        int gcd = numbers[0];
        int lcm = numbers[0];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
            // Update GCD and LCM for each number
            gcd = calculateGCD(gcd, numbers[i]);
            lcm = calculateLCM(lcm, numbers[i]);
        }
        
        scanner.close();

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
