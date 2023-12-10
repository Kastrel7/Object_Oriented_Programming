package Lab15.Exc1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked){
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }

    public int getPointOnScale(){
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  GregorianCalendar.getInstance().get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
                || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        if(yearsWorked>=3 && hoursWorked>1500) //as long as the lecturer has been appointed for at least 3 years
            //and they have worked over 1500 hours in total
            return 4; //a temporary lecturer cannot get beyond the 4th point of the scale
        else if(yearsWorked>=3 && hoursWorked>1000) //this part rewards those who have been appointed for at least 3 years
            //have more than 1000 hours worked
            return (int)(hoursWorked/700f*1.33)+1;
        else
            return yearsWorked; //if they have been appointed fewer than 3 years
    }

    public String toString(){
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked() + "\n\n";
    }
}
