package FirstOOPCA2021.assesment;

public class Library {
    private String name;
    private String address;
    private String librarian;
    private int numberEmployees;
    private Book[] books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library(String name, String address, String librarian, int numberEmployees, Book[] books){
        setName(name);
        setAddress(address);
        setLibrarian(librarian);
        setNumberEmployees(numberEmployees);
        setBooks(books);
    }

    public String toString(){
        String str = "Library Details - Name: " + getName() + "  Address: " + getAddress() + "  Librarian: " + getLibrarian() + "  Number of Employees: " + getNumberEmployees() + "\n\nBook Details:";
        for(int x = 0; x < books.length; x++){
            if(books[x] != null){
                str += String.format("\n\n%s", books[x]);
            }
        }
        str += "\n\n\nLibrary Book Count: " + getBookCount();
        return str;
    }

    private int getBookCount(){
        int bookCount = 0;
        for(int x = 0; x < books.length; x++){
            if(books[x] != null){
                bookCount += books[x].getNumberCopies();
            }
        }
        return bookCount;
    }

    public Book findBook(String seek){
        Book foundBook = books[0];
        for(int x = 0; x < books.length; x++){
            if(books[x] != null && books[x].getTitle().equals(seek)) {
                foundBook = books[x];
                break;
            }
        }
        return foundBook;
    }

    public void addBook(Book b1){
        for(int x = 0; x < books.length; x++){
            if(books[x] != null && b1.getISBN().equals(books[x].getISBN())){
                int newNum = books[x].getNumberCopies() + b1.getNumberCopies();
                books[x].setNumberCopies(newNum);
                break;
            }
            else if(books[x] == null){
                books[x] = b1;
                break;
            }
        }
    }
}
