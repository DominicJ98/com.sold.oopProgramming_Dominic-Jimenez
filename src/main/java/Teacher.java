import java.util.Objects;

public class Teacher extends Person {

    private int teacherID;
    private String subject;
    private int classroom;

    public Teacher(String name, int age, int teacherID, String subject, int classroom) {
        super(name, age);
        this.teacherID = teacherID;
        this.subject = subject;
        this.classroom = classroom;
    }

    @Override
    public void IDCard() {
        super.IDCard();
        System.out.println("Subject: " + subject);
        System.out.println("Teacher Number: " + teacherID);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", subject='" + subject + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherID, teacher.teacherID) && Objects.equals(subject, teacher.subject) && Objects.equals(classroom, teacher.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teacherID, subject, classroom);
    }
}
