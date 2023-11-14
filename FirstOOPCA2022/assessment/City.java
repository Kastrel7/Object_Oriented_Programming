package FirstOOPCA2022.assessment;

public class City {
    private String name;
    private int population;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public City(String name, int population, Location location){
        setName(name);
        setPopulation(population);
        setLocation(location);
    }

    public Location getLocation() {
        return new Location(location.getLatitude(), location.getLongitude());
    }

    public void setLocation(Location location) {
        this.location = new Location(location.getLatitude(),location.getLongitude());
    }

    public String toString(){
        String str = String.format("Name: %-20sPopulation: %-20s\t\tLocation: %s",getName(), getPopulation(), getLocation());
        return str;
    }

    public static double getDistanceBetween(City c1,City c2){

        double distance = 110.25*Math.sqrt(Math.pow(c1.getLocation().getLatitude() - c2.getLocation().getLatitude(),2) +
                Math.pow((c1.getLocation().getLongitude() - c2.getLocation().getLongitude()) *
                        Math.cos(c2.getLocation().getLatitude()*Math.PI/180),2));

        return distance;
    }
}
