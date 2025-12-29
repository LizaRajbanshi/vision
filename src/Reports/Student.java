package Reports;



public class Student {

    private int id;
    private String name;
    private double attendance;

    public Student(int id, String name, double attendance) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
    }

    public double getAttendance() {
        return attendance;
    }

    public String getName() {
        return name;
    }
}
