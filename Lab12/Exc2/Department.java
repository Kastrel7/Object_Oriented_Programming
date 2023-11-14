package Lab12.Exc2;

public class Department {
    private String name;
    private String[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public Department(String name, String[] students){
        setName(name);
        setStudents(students);
    }

    public String toString(){
        return "";
    }
}
