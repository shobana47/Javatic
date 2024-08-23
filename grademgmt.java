class Student {
    private int grade;

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Invalid grade. Grade must be between 0 and 100.");
        }
    }

    public int getGrade() {
        return grade;
    }
}

public class grademgmt {
    public static void main(String[] args) {
        Student student = new Student();

        student.setGrade(85);
        System.out.println("Valid Grade: " + student.getGrade());

        student.setGrade(110);
        System.out.println("Grade after Invalid High Value: " + student.getGrade());
    }
}
