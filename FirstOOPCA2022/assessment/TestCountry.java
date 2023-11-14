package FirstOOPCA2022.assessment;

import javax.swing.*;

public class TestCountry {
    public static void main(String[] args){
        City city1 = new City("Cork", 124391, new Location(51.8985, 8.4756));
        City city2 = new City("Galway", 79934, new Location(53.2707, 9.0568));
        City city3 = new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City city4 = new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City city5 = new City("Waterford", 53504, new Location(52.2593, 7.1101));

        City[] cities = new City[5];
        cities[0] = city1;
        cities[1] = city2;
        cities[2] = city3;
        cities[3] = city4;
        cities[4] = city5;

        Country country = new Country("Ireland","Dublin",4904000,70273, cities, "euro", "English");
        JOptionPane.showMessageDialog(null, country, "Country Details", JOptionPane.INFORMATION_MESSAGE);

        String locationStr = String.format("The distance between Limerick and Dublin is: %.2fkm",City.getDistanceBetween(city4, city3));
        JOptionPane.showMessageDialog(null, locationStr, "Distance Between Limerick and Dublin", JOptionPane.INFORMATION_MESSAGE);
        
        String populous = String.format("The details of the most populous city are:\n\n%s", country.getMostPopulousCity());
        JOptionPane.showMessageDialog(null, populous, "Details of the Most Populous City", JOptionPane.INFORMATION_MESSAGE);

        country.sortCitiesByName();
        String sorted = String.format("The cities sorted by name are: \n\n%s", country);
        JOptionPane.showMessageDialog(null, sorted, "Cities Sorted by Name", JOptionPane.INFORMATION_MESSAGE);
    }
}
