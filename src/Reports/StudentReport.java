package Reports;

	import java.util.List;

	public class StudentReport {

	    private int studentId;
	    private List<String> courses;
	    private List<Double> marks;
	    private double attendancePercentage;

	    // Constructor
	    public StudentReport(int studentId, List<String> courses, List<Double> marks, double attendancePercentage) {
	        this.studentId = studentId;
	        this.courses = courses;
	        this.marks = marks;
	        this.attendancePercentage = attendancePercentage;
	    }

	    // Getters
	    public int getStudentId() {
	        return studentId;
	    }

	    public List<String> getCourses() {
	        return courses;
	    }

	    public List<Double> getMarks() {
	        return marks;
	    }

	    public double getAttendancePercentage() {
	        return attendancePercentage;
	    }

	    // Display Report
	    public void displayReport() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Courses and Marks:");
	        for (int i = 0; i < courses.size(); i++) {
	            System.out.println(courses.get(i) + " : " + marks.get(i));
	        }
	        System.out.println("Attendance: " + attendancePercentage + "%");
	    }
	}

