package interfaces;

import person.Student;

import java.util.List;

public interface Advise {
    void adviseStudent(Student student);
    List<Student> getAdvisedStudents();
}
