import java.util.*;

class Multiplicationtable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Both M and N should be positive integers.");
        } else {
            for (int i = 1; i <= n; i++) {
                int result = i * m;
                System.out.println(i + "x" + m + "=" + result);
            }
        }
        scanner.close();
    }
}
