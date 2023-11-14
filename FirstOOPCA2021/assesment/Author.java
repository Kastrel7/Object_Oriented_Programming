package FirstOOPCA2021.assesment;

public class Author {
    private static int authorID;
    private int authorNumber;
    private String firstname;
    private String lastname;

    public int getAuthorNumber() {
        return authorNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Author(String firstname, String lastname){
        authorNumber = ++authorID;
        setFirstname(firstname);
        setLastname(lastname);
    }

    public String toString(){
        return "--- Author - Number: " + getAuthorNumber() + " --- Name: " + getFirstname() + " " + getLastname();
    }
}
