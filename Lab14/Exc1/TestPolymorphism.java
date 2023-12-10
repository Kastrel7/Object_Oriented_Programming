package Lab14.Exc1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3]; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        SelfEmployedWorker s1 = new SelfEmployedWorker("Kass", "Smith");

        employees[0] = b1;

        employees[1] = hw1;

        employees[2] = s1;

        for (int x = 0; x < employees.length; x++){
            System.out.println(employees[x].toString() + " and the earnings were €" + String.format("%.2f", employees[x].earnings()) + "\n");
        }
    }
}