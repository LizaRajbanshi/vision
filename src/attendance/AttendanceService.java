package attendance;

import java.time.LocalDate;

public class AttendanceService {
    private AttendanceDAO dao = new AttendanceDAOImpl();

    public boolean markPresent(int studentId, int courseId, LocalDate date) {
        return dao.markAttendance(new Attendance(studentId, courseId, date, "Present"));
    }

    public boolean markAbsent(int studentId, int courseId, LocalDate date) {
        return dao.markAttendance(new Attendance(studentId, courseId, date, "Absent"));
    }

    public double getAttendancePercentage(int studentId, int courseId) {
        return dao.calculateAttendancePercentage(studentId, courseId);
    }
}
