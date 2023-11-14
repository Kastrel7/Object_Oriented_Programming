package Lab12.Exc3;

public class Institute {

    private String name;
    private Department[] departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    public String toString(){
        String str = "Name: " + getName() + "\n\nDepartments:";

        for(int x = 0; x < getDepartments().length; x++){
            if(departments[x] != null)
                str += departments[x];
        }
        return str;
    }

    public int getTotalStudents(){
        int num = 0;
        Student[] students;

        for(int x = 0; x < departments.length; x++){
            if(departments[x] != null){
                students = departments[x].getStudents();

                for(int y = 0; y < students.length; y++){
                    if(students[y] != null)
                        num++;
                }
            }
        }
        return num;
    }

}
