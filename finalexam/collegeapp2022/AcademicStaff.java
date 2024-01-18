package finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public class AcademicStaff extends Employee{
    private String[] coursesTaught;

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public AcademicStaff(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] coursesTaught){
        super(name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setCoursesTaught(coursesTaught);
    }

    public String toString(){
        return "";
    }

    public double calculateEarnings(){
        return 0;
    }

    @Override
    public double calculateEarnings(int pointsOnScale, String str) {
        return 0;
    }
}
