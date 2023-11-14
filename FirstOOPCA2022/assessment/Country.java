package FirstOOPCA2022.assessment;

import javax.swing.*;
import java.util.Arrays;

public class Country {
    private String name;
    private String capital;
    private int population;
    private int area;
    private City[] cities;
    private String currency;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language){
        setName(name);
        setCapital(capital);
        setPopulation(population);
        setArea(area);
        setCities(cities);
        setCurrency(currency);
        setLanguage(language);
    }

    public String toString(){
        String str =  String.format("Name: %s\nCapital: %s\nPopulation: %s\nArea: %s\nCities:\n\n", getName(), getCapital(), getPopulation(), getArea());
        
        for(int x = 0; x < getCities().length; x++){
            if(cities[x] != null){
                str += cities[x] + "\n";
            }
        }

        str += String.format("\n\nCurrency: %s\nLanguage: %s", getCurrency(), getLanguage());
        return str;
    }

    public City getMostPopulousCity(){
        City mostPopulous = cities[0];
        for(int x = 0; x < cities.length; x++){
            if (cities[x].getPopulation() > mostPopulous.getPopulation())
                mostPopulous = cities[x];
        }
        return mostPopulous;
    }
    public void sortCitiesByName() {

        City[] citiesCopy = Arrays.copyOf(cities,cities.length);

        City smallestCity, temp;
        int smallestSub;

        for(int i=0; i < cities.length; i++){

            smallestCity = citiesCopy[i];
            smallestSub = i;

            for(int j = i+1; j < cities.length; j++){
                if(citiesCopy[j].getName().compareTo(smallestCity.getName()) < 0) {
                    smallestCity = citiesCopy[j];
                    smallestSub = j;
                }
            }

            temp = citiesCopy[i];
            citiesCopy[i] = citiesCopy[smallestSub];
            citiesCopy[smallestSub] = temp;
        }

        String allCities = "";

        for(int i = 0; i < citiesCopy.length; i++){

            allCities += citiesCopy[i] + "\n";

        }

        JOptionPane.showMessageDialog(null,"The cities sorted by name are:\n\n" + allCities,
                "Cities Sorted By Name",JOptionPane.INFORMATION_MESSAGE);
    }
}
