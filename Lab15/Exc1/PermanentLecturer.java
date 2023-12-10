package Lab15.Exc1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements, String status){
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public int getPointOnScale(){
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  GregorianCalendar.getInstance().get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
                || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;
        if (yearsWorked > 20)
            yearsWorked = 20;

        return yearsWorked;
    }

    public String toString(){
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements() + "\n\n";
    }
}
