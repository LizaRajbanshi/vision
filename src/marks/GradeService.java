package marks;

public class GradeService {

    public String calculateGrade(double marks) {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "F";
    }

    public boolean assignGrade(Marks marks) {
        marks.setGrade(calculateGrade(marks.getMarks()));
        return true;
    }
}
