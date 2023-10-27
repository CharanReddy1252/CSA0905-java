import java.util.*;
 class LeapYearChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        
        int year = Integer.parseInt(date.split("/")[2]);

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non-Leap Year");
        }

        scanner.close();
    }
}
