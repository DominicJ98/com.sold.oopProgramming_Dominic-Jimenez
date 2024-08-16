import java.util.Objects;

public class Student extends Person{
    private int studentID;
    private String gradeLevel;
    private double GPA;

    public Student(String name, int age, int studentID, String gradeLevel, double GPA) {
        super(name, age);
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
    }

    @Override
    public void IDCard() {
        super.IDCard();
        System.out.println("Student Number: " + studentID);
        System.out.println("Grade: " + gradeLevel);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.GPA, GPA) == 0 && Objects.equals(studentID, student.studentID) && Objects.equals(gradeLevel, student.gradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentID, gradeLevel, GPA);
    }
}
