package person;

import interfaces.Advise;
import interfaces.Research;
import interfaces.Teach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor extends Person implements Teach, Advise, Research {

    private List<String> coursesTeaching = new ArrayList<>();
    private List<Student> advisedStudents = new ArrayList<>();
    private List<String> researchTopics = new ArrayList<>();
    private int professorID;
    private String subject;
    private int classroom;

    public Professor(String name, int age, int teacherID, String subject, int classroom) {
        super(name, age);
        this.professorID = teacherID;
        this.subject = subject;
        this.classroom = classroom;
    }

    @Override
    public void IDCard() {
        super.IDCard();
        System.out.println("Subject: " + subject);
        System.out.println("person.Professor Number: " + professorID);
        System.out.println();
    }

    @Override
    public void teachCourse(String courseName) {
        coursesTeaching.add(courseName);
    }

    @Override
    public List<String> getCoursesTeaching() {
        return coursesTeaching;
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
    public void conductResearch(String topic) {
        researchTopics.add(topic);
    }

    @Override
    public List<String> getResearchTopics() {
        return researchTopics;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + professorID + '\'' +
                ", subject='" + subject + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(professorID, professor.professorID) && Objects.equals(subject, professor.subject) && Objects.equals(classroom, professor.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), professorID, subject, classroom);
    }
}
