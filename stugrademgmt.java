import java.util.Scanner;

class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    // Constructor
    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public double getFinalExamGrade() {
        return finalExamGrade;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2.0;
    }
}

public class stugrademgmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter student details
        System.out.println("\t\t\t----------------------------------");
        System.out.println("\t\t\tSTUDENT GRADE MANAGEMENT SYSTEM   ");
        System.out.println("\t\t\t----------------------------------");

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter homework grade: ");
        double homeworkGrade = scanner.nextDouble();

        System.out.print("Enter final exam grade: ");
        double finalExamGrade = scanner.nextDouble();

        // Create a Student object using the provided input
        Student student = new Student(name, homeworkGrade, finalExamGrade);

        // Calculate and display the average grade
        double averageGrade = student.calculateAverageGrade();

        // Display the student's details and average grade
        System.out.println("\nStudent Name: " + student.getName());
        System.out.println("Homework Grade: " + student.getHomeworkGrade());
        System.out.println("Final Exam Grade: " + student.getFinalExamGrade());
        System.out.println("Average Grade: " + averageGrade);

        scanner.close();
    }
}
