package interfaces;

import java.util.List;

public interface Study {
    void enrollInCourse(String courseName);
    List<String> getCoursesEnrolled();
}
