package Mypackage;
import java.util.Scanner;

public class GradeFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("         GRADE FREQUENCY COUNTER");
        System.out.println("===========================================\n");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        String[] rollNumbers = new String[n];
        char[] grades = new char[n];

        System.out.println("\nEnter student details:\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            rollNumbers[i] = "25100" + String.format("%05d", i + 1); // auto roll number
            System.out.println("Assigned Roll No: " + rollNumbers[i]);

            System.out.print("Enter Grade (A, B, C, D, F): ");
            grades[i] = Character.toUpperCase(sc.next().charAt(0));
            sc.nextLine(); 
            System.out.println();
        }

        
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        // Count grade frequencies
        for (char grade : grades) {
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
                default: System.out.println("Invalid grade entered: " + grade);
            }
        }

        
        System.out.println("\n===========================================");
        System.out.println("           STUDENT GRADE REPORT");
        System.out.println("===========================================");
        System.out.printf("%-15s %-15s %-10s\n", "Roll No", "Name", "Grade");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-15s %-10s\n", rollNumbers[i], names[i], grades[i]);
        }

        
        System.out.println("\n===========================================");
        System.out.println("             GRADE SUMMARY");
        System.out.println("===========================================");
        System.out.printf("%-10s %-15s %-10s\n", "Grade", "Count", "Percentage");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s %-15d %-10.2f%%\n", "A", countA, (countA * 100.0 / n));
        System.out.printf("%-10s %-15d %-10.2f%%\n", "B", countB, (countB * 100.0 / n));
        System.out.printf("%-10s %-15d %-10.2f%%\n", "C", countC, (countC * 100.0 / n));
        System.out.printf("%-10s %-15d %-10.2f%%\n", "D", countD, (countD * 100.0 / n));
        System.out.printf("%-10s %-15d %-10.2f%%\n", "F", countF, (countF * 100.0 / n));
        System.out.println("===========================================");
        System.out.println("Total Students: " + n);
        System.out.println("===========================================");

        sc.close();
    }
}
