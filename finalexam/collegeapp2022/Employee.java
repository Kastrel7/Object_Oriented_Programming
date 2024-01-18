package finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public abstract class Employee implements Payable{
    private String name;
    private String address;
    private String mobileNumber;
    private String tNumber;
    private GregorianCalendar dateOfBirth;
    private String workPattern;
    private String role;
    private int pointOnScale;
    private String office;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTNumber() {
        return tNumber;
    }

    public void setTNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWorkPattern() {
        return workPattern;
    }

    public void setWorkPattern(String workPattern) {
        this.workPattern = workPattern;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPointOnScale() {
        return pointOnScale;
    }

    public void setPointOnScale(int pointOnScale) {
        this.pointOnScale = pointOnScale;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Employee(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office){
        setName(name);
        setAddress(address);
        setMobileNumber(mobileNumber);
        setTNumber(tNumber);
        setDateOfBirth(dateOfBirth);
        setWorkPattern(workPattern);
        setRole(role);
        setPointOnScale(pointOnScale);
        setOffice(office);
    }

    public String toString(){
        return "";
    }
}
