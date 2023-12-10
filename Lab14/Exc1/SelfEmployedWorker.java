package Lab14.Exc1;

public class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public void setEstimatedIncome() {
        this.estimatedIncome = Math.random()*(900-400+1)+400;
    }

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName, lastName);
        setEstimatedIncome();
    }

    public double earnings(){
        return estimatedIncome;
    }

    public String toString(){
        return "Self-employed worker's name is " + super.toString();
    }
}
