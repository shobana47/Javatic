import java.util.*;

public class map_practiceUser {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name:");
            String name = scanner.nextLine();
            System.out.print("Enter student grade:");
            int grade = scanner.nextInt();
            scanner.nextLine();  
            studentGrades.put(name, grade);
        }
        System.out.println("\nStudent Grades:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + ": " + studentGrades.get(name));
        }

        scanner.close();
    }
}