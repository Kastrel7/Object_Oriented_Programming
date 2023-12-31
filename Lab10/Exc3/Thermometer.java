package Lab10.Exc3;

public class Thermometer {

    private int maximumTemperature;
    private int minimumTemperature;
    private int currentTemperature;

    public Thermometer() {
        setCurrentTemperature(0);
        setMaximumTemperature(Integer.MIN_VALUE);
        setMinimumTemperature(Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemperature) {
        setCurrentTemperature(currentTemperature);
        setMaximumTemperature(currentTemperature);
        setMinimumTemperature(currentTemperature);
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    private void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    private void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setTemperature(int currentTemperature) {
        setCurrentTemperature(currentTemperature);
        updateMaxMinTemp();
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    private void updateMaxMinTemp() {

        if (currentTemperature > maximumTemperature)
            setMaximumTemperature(currentTemperature);

        if (currentTemperature < minimumTemperature)
            setMinimumTemperature(currentTemperature);
    }

    public String toString() {
        return "Current temperature: " + getCurrentTemperature() + "\n" +
                "Maximum temperature: " + getMaximumTemperature() + "\n" +
                "Minimum temperature: " + getMinimumTemperature() + "\n";
    }
}
