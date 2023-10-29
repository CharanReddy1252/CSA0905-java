import java.util.Scanner;

class Student {
    String name;
    int registerNumber;
    double[] subjectMarks = new double[5];

    public Student(String name, int registerNumber, double[] subjectMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }

    public double calculateTotal() {
        double total = 0;
        for (double mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        double total = calculateTotal();
        return total / subjectMarks.length;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student register number: ");
        int registerNumber = scanner.nextInt();

        double[] subjectMarks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, registerNumber, subjectMarks);

        System.out.println("Student Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Register Number: " + student.registerNumber);

        System.out.println("Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + student.subjectMarks[i]);
        }

        double total = student.calculateTotal();
        double average = student.calculateAverage();

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        scanner.close();
    }
}
