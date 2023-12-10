package Lab14.Exc2;

public class Triangle extends Shape{
    protected double side1Length;
    protected double side2Length;
    protected double side3Length;

    public Triangle(){
        super("Triangle");
    }

    public double getSide1Length() {
        return side1Length;
    }

    public void setSide1Length(double side1Length) {
        if (side1Length > 0)
            this.side1Length = side1Length;
        else
            this.side1Length = 0;
    }

    public double getSide2Length() {
        return side2Length;
    }

    public void setSide2Length(double side2Length) {
        if (side2Length > 0)
            this.side2Length = side2Length;
        else
            this.side2Length = 0;
    }

    public double getSide3Length() {
        return side3Length;
    }

    public void setSide3Length(double side3Length) {
        if (side3Length > 0)
            this.side3Length = side3Length;
        else
            this.side3Length = 0;
    }

    public Triangle(double side1Length, double side2Length, double side3Length){
        super("Triangle");
        setSide1Length(side1Length);
        setSide2Length(side2Length);
        setSide3Length(side3Length);
    }

    public double area(){
        double s = (side1Length+side2Length+side3Length)/2;

        return Math.sqrt(s*((s - side1Length)*(s - side2Length)*(s - side3Length)));
    }

    public double perimeter(){
        return side1Length + side2Length + side3Length;
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
