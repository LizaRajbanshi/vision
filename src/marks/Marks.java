package marks;

public class Marks {
    private int marksId;
    private int studentId;
    private int courseId;
    private double marks;
    private String grade;

    public Marks(int studentId, int courseId, double marks) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.marks = marks;
    }

    public double getMarks() { return marks; }
    public void setGrade(String grade) { this.grade = grade; }
}
