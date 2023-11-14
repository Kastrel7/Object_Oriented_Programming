package Lab12.Exc2;

public class Institute {

    private String name;
    private String[] departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public Institute(String name, String[] departments){
        setName(name);
        setDepartments(departments);
    }

    public String toString(){
        return "";
    }

}
