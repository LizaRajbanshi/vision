package marks;

import auth.AuthService;
import attendance.AttendanceService;
import marks.GradeService;
import student.Student;
import student.StudentDAO;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Student Management System Started ===");

        // Authentication demo
        AuthService authService = new AuthService();
        System.out.println("Login Status: " +
                authService.authenticate("admin", "admin123"));

        // Student demo
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student(1, "Liza", "CS001", "liza@email.com");
        studentDAO.addStudent(student);

        // Attendance demo
        AttendanceService attendanceService = new AttendanceService();
        attendanceService.markPresent(1, 101, LocalDate.now());

        // Grade demo
        GradeService gradeService = new GradeService();
        System.out.println("Grade for 85 marks: " +
                gradeService.calculateGrade(85));

        System.out.println("=== System Running Successfully ===");
    }
}
