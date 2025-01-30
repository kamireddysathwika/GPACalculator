import java.util.*;
public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
         double totalGrades = 0.0;
for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + " (0.0 to 10.0): ");
            double grade = scanner.nextDouble();
            while (grade < 0.0 || grade > 4.0) {
                System.out.println("Invalid grade. Please enter a value between 0.0 and 10.0.");
                System.out.print("Enter the grade for subject " + i + ": ");
                grade = scanner.nextDouble();
            }
             totalGrades += grade;
        }
          double gpa = totalGrades / numSubjects;
          System.out.printf("Your avg GPA is: %.2f%n", gpa);
    scanner.close();
    }
}