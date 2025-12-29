package attendance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAOImpl implements AttendanceDAO {

    private List<Attendance> records = new ArrayList<>();

    @Override
    public boolean markAttendance(Attendance attendance) {
        if (attendanceExists(attendance.getStudentId(), attendance.getCourseId(), attendance.getDate())) {
            return false; 
        }
        records.add(attendance);
        return true;
    }

    @Override
    public boolean attendanceExists(int studentId, int courseId, LocalDate date) {
        return records.stream()
                .anyMatch(a -> a.getStudentId() == studentId 
                            && a.getCourseId() == courseId 
                            && a.getDate().equals(date));
    }

    @Override
    public double calculateAttendancePercentage(int studentId, int courseId) {
        long total = records.stream()
                .filter(a -> a.getStudentId() == studentId && a.getCourseId() == courseId)
                .count();
        long present = records.stream()
                .filter(a -> a.getStudentId() == studentId 
                          && a.getCourseId() == courseId 
                          && a.getStatus().equalsIgnoreCase("Present"))
                .count();
        return total == 0 ? 0 : (present * 100.0 / total);
    }
}
