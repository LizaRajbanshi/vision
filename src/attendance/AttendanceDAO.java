package attendance;

import java.time.LocalDate;

public interface AttendanceDAO {
    boolean markAttendance(Attendance attendance);
    boolean attendanceExists(int studentId, int courseId, LocalDate date);
    double calculateAttendancePercentage(int studentId, int courseId);
}
