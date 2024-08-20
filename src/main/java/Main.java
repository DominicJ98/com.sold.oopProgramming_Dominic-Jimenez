import person.Counselor;
import person.Professor;
import person.Student;

public class Main {
    public static void main(String args[]) {
        Counselor counselor = new Counselor("Sam White", 45, 451235, "Success person.Counselor", "A-J");
        counselor.organizeEvent("Resume Workshop");

        Professor mathProfessor = new Professor("Kim Smith", 38, 12345, "Math", 458);
        mathProfessor.teachCourse("Calculus");
        mathProfessor.conductResearch("Algebra");

        Professor scienceProfessor = new Professor("Jim Yellow", 40, 54612, "Science", 405);
        scienceProfessor.teachCourse("Chemisty");
        scienceProfessor.conductResearch("Endothermic Reactions");

        Student student = new Student("Bob Brown", 19, 4521, "Freshman", 3.5);
        student.enrollInCourse("Calculus");
        student.conductResearch("Biology");

        UniverityRules rules = new UniverityRules();
        rules.printRules();

        University.enrollStudent();
        University.hireEmployee();

        counselor.IDCard();
        mathProfessor.IDCard();
        scienceProfessor.IDCard();
        student.IDCard();

        System.out.println("Professor " + mathProfessor.getName() + " teaches: " + mathProfessor.getCoursesTeaching());
        System.out.println("Professor " + mathProfessor.getName() + " research topics: " + mathProfessor.getResearchTopics());
        System.out.println("Professor " + scienceProfessor.getName() + " teaches: " + mathProfessor.getCoursesTeaching());
        System.out.println("Professor " + scienceProfessor.getName() + " research topics: " + mathProfessor.getResearchTopics());
        System.out.println("Counselor organizes: " + counselor.getOrganizedEvents());
        System.out.println("Student enrolled in: " + student.getCoursesEnrolled());
        System.out.println("Student's research topics: " + student.getResearchTopics());
    }
}
