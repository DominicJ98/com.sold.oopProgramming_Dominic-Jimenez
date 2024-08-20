package person;

import interfaces.Organize;
import interfaces.Research;
import interfaces.Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person implements Study, Research, Organize {
    private List<String> coursesEnrolled = new ArrayList<>();
    private List<String> researchTopics = new ArrayList<>();
    private List<String> organizedEvents = new ArrayList<>();

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
        System.out.println("person.Student Number: " + studentID);
        System.out.println("Grade: " + gradeLevel);
        System.out.println();
    }

    @Override
    public void enrollInCourse(String courseName) {
        coursesEnrolled.add(courseName);
    }

    @Override
    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
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
    public void organizeEvent(String eventName) {
        organizedEvents.add(eventName);
    }

    @Override
    public List<String> getOrganizedEvents() {
        return organizedEvents;
    }

    @Override
    public String toString() {
        return "person.Student{" +
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
