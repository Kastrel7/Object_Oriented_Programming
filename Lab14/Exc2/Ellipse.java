package Lab14.Exc2;

public class Ellipse extends Shape{
    protected double majorAxis;
    protected double minorAxis;

    public Ellipse(){
        super("Ellipse");
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis > 0)
            this.majorAxis = majorAxis;
        else
            this.majorAxis = 0;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis > 0)
            this.minorAxis = minorAxis;
        else
            this.minorAxis = 0;
    }

    public Ellipse(double majorAxis, double minorAxis){
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double area(){
        return Math.PI*majorAxis*minorAxis;
    }

    public double perimeter(){
        return (2*Math.PI)*(Math.sqrt(((Math.pow(majorAxis, 2)) + (Math.pow(minorAxis, 2)))/2));
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
