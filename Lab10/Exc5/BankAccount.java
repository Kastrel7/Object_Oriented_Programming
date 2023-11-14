package Lab10.Exc5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;


    public BankAccount(){
        this("Owner Not Available",0);
    }

    public BankAccount(String owner, double interestRate) {
        incrementCount();
        setOwner(owner);
        setNumber(count);
        setInterestRate(interestRate);
    }

    private static void incrementCount() {
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString() {
        return "Owner: " + getOwner() + "  Account Number: " + getNumber() +
                "  Interest Rate: " + getInterestRate();
    }


}
