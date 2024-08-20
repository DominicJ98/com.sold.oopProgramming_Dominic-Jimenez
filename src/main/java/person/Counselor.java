package person;

import interfaces.Advise;
import interfaces.Organize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Counselor extends Person implements Advise, Organize {
    private List<Student> advisedStudents = new ArrayList<>();
    private List<String> organizedEvents = new ArrayList<>();
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
    public void adviseStudent(Student student) {
        advisedStudents.add(student);
    }

    @Override
    public List<Student> getAdvisedStudents() {
        return advisedStudents;
    }

    @Override
    public void organizeEvent(String eventName) {
        organizedEvents.add(eventName);
    }

    @Override
    public List<String> getOrganizedEvents() {
        return organizedEvents;
    }

    @Override
    public String toString() {
        return "person.Counselor{" +
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
