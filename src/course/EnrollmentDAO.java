package course;

import java.util.*;

public class EnrollmentDAO {
    private Map<Integer, List<Course>> enrollments = new HashMap<>();

    // Enroll student
    public boolean enrollStudent(int studentId, Course course) {
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        return enrollments.get(studentId).add(course);
    }

    // Remove enrollment
    public boolean removeEnrollment(int studentId, Course course) {
        if (enrollments.containsKey(studentId)) {
            return enrollments.get(studentId).remove(course);
        }
        return false;
    }

    // Get courses by student
    public List<Course> getCoursesByStudent(int studentId) {
        return enrollments.getOrDefault(studentId, new ArrayList<>());
    }
}
