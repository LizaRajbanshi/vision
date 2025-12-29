package Reports;
import java.util.*;
import Reports.Student;
import Reports.Course;

public class ReportDAO {

    // Generate student report
    public StudentReport generateStudentReport(int studentId) {

        // Dummy data (replace with DB logic later)
        List<String> courses = Arrays.asList("Java", "Database", "Web Development");
        List<Double> marks = Arrays.asList(78.5, 85.0, 90.0);
        double attendance = 82.5;

        return new StudentReport(studentId, courses, marks, attendance);
    }

    // Generate course attendance report
    public Map<Course, Double> generateCourseAttendanceReport(int courseId) {

        Map<Course, Double> attendanceReport = new HashMap<>();

        // Dummy data
        Course course1 = new Course(courseId, "Java Programming");
        attendanceReport.put(course1, 88.5);

        return attendanceReport;
    }

    // Get defaulter list
    public List<Student> getDefaulterList(double minAttendance) {

        List<Student> defaulters = new ArrayList<>();

        // Dummy students
        Student s1 = new Student(1, "Ram", 65.0);
        Student s2 = new Student(2, "Sita", 72.0);

        if (s1.getAttendance() < minAttendance) {
            defaulters.add(s1);
        }

        if (s2.getAttendance() < minAttendance) {
            defaulters.add(s2);
        }

        return defaulters;
    }
}
