package Lab13.Exc2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public Bicycle(){
        setHasBell(false);
        setGearCount(0);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell){
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public String toString(){
        String str = super.toString() + "\nHas bell: ";

        if(getHasBell())
            str+="Yes";
        else
            str+="No";

        str+="\nGear Count: " + getGearCount();

        return str;
    }
}
