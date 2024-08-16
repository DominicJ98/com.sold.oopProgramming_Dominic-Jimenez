import java.util.Objects;

public class Counselor extends Person{
    private int facultyID;
    private String title;
    private String studentRange;

    public Counselor(String name, int age, int facultyID, String title, String studentRange) {
        super(name, age);
        this.facultyID = facultyID;
        this.title = title;
        this.studentRange = studentRange;
    }

    @Override
    public void IDCard() {
        super.IDCard();
        System.out.println("Title: " + title);
        System.out.println("Faculty Number: " + facultyID);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Counselor{" +
                "facultyID='" + facultyID + '\'' +
                ", title='" + title + '\'' +
                ", studentRange='" + studentRange + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counselor)) return false;
        if (!super.equals(o)) return false;
        Counselor counselor = (Counselor) o;
        return Objects.equals(facultyID, counselor.facultyID) && Objects.equals(title, counselor.title) && Objects.equals(studentRange, counselor.studentRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facultyID, title, studentRange);
    }
}
