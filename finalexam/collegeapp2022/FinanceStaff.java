package finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public class FinanceStaff extends Employee{
    private String[] duties;

    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }

    public FinanceStaff(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] duties){
        super(name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setDuties(duties);
    }

    public String toString(){
        return "";
    }

    @Override
    public double calculateEarnings(int pointsOnScale, String str) {
        return 0;
    }
}
