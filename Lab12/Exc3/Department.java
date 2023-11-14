package Lab12.Exc3;

public class Department {
    private String name;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Department(String name, Student[] students){
        setName(name);
        setStudents(students);
    }

    public String toString(){
        String str = "\nName: " + getName() + "\nList of Students:\n\n";

        for(int x = 0; x < getStudents().length; x++){
            if(students[x] != null)
                str += students[x];
        }
        return str;
    }
}
