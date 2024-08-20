package interfaces;

import java.util.List;

public interface Teach {
    void teachCourse(String courseName);
    List<String> getCoursesTeaching();
}
