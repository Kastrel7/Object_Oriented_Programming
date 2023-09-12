package Lab1;

public class FormattingVariables {

    public static void main(String[] args) {

        String country1 = "Ireland";
        int population1 = 7026636;
        double populationDensity1 = 82.2;

        String country2 = "United Kingdom";
        int population2 = 68138484;
        double populationDensity2 = 270.7;

        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s"
                "Name","Population","Pop Density",
                "----","----------","-----------"));

        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s",
                country1,population1,populationDensity1,
                country2,population2,populationDensity2));
    }
}
