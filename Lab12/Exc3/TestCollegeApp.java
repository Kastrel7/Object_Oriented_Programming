package Lab12.Exc3;

public class TestCollegeApp {
    public static void main(String[] args){
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(452726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] computing = new Student[10], creativeMedia = new Student[10];
        computing[0] = student1;
        computing[1] = student3;
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department department1 = new Department("Computing", computing);
        Department department2 = new Department("Creative Media", creativeMedia);

        Department[] departments = new Department[5];
        departments[0] = department1;
        departments[1] = department2;
        
        Institute institute1 = new Institute("Institute of Technology, Tralee", departments);

        System.out.println(institute1);

        System.out.print("Total students in institute: ");
        System.out.println(institute1.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        int creativeMediaSubscript=-1, computingSubscript=-1;

        for(int x = 0; x < departments.length; x++){
            if(departments[x] != null && departments[x].getName().equals("Creative Media"))
                creativeMediaSubscript = x;
            if(departments[x] != null && departments[x].getName().equals("Computing"))
                computingSubscript = x;
        }

        if (computingSubscript != -1 && creativeMediaSubscript != -1){
            Student[] allDeptStudents = departments[computingSubscript].getStudents();
            int x;
            for(x = 0; x < allDeptStudents.length; x++){
                if(allDeptStudents[x] != null) {
                    if (allDeptStudents[x].getId() == 154345) {
                        System.out.println("\nFound Jake\n");
                        allDeptStudents[x].setDepartment("Creative Media");
                        departments[creativeMediaSubscript].getStudents()[2] = allDeptStudents[x];
                        allDeptStudents[x] = null;
                        break;
                    }
                }
            }

            if(x == allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
        System.out.println(institute1);

    }
}
