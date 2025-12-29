package student;

import java.util.*;

public class StudentDAO {
    private List<Student> students = new ArrayList<>();
    private int idCounter = 1;

    // Add student
    public boolean addStudent(Student student) {
        student.setStudentId(idCounter++);
        return students.add(student);
    }

    // Update student
    public boolean updateStudent(Student student) {
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                s.setName(student.getName());
                s.setRollNo(student.getRollNo());
                s.setEmail(student.getEmail());
                return true;
            }
        }
        return false;
    }

    // Delete student
    public boolean deleteStudent(int studentId) {
        return students.removeIf(s -> s.getStudentId() == studentId);
    }

    // Get student by ID
    public Student getStudentById(int studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) return s;
        }
        return null;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }
}
