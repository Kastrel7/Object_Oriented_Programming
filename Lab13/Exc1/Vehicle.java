package Lab13.Exc1;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle() {
        this(0,0,0,0, "No manufacturer specified","No model specified");
    }
    public Vehicle(double price, double length, double height, double weight, String manufacturer, String model){
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }
    
    public String toString(){
        return "\nPrice: " + getPrice() + "\nLength: " + getLength() + "\nHeight: " + getHeight() +
                "\nWeight: " + getWeight() + "\nManufacturer: " + getManufacturer() + 
                "\nModel: " + getModel();
    }
}
