package Lab09.Exc5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Not Available", 0, "Not Available", 0);
    }

    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        if (title.isEmpty()) {
            this.title = "No Valid Title Supplied";
        }
        else{
            this.title = title;
        }
    }

    public void setPrice(double price){
        if (price < 0 || price > 50000){
            this.price = 0;
        }
        else{
            this.price = price;
        }
    }

    public void setISBN(String ISBN){
        if (ISBN.isEmpty()) {
            this.ISBN = "No Valid ISBN Supplied";
        }
        else{
            this.ISBN = ISBN;
        }
    }

    public void setPages(int pages){
        if (pages < 0 || pages > 4000) {
            this.pages = 0;
        }
        else{
            this.pages = pages;
        }
    }

    public String toString(){
        return String.format("%-25s%-10s%-25s%s\n\n",getTitle(), getPrice(), getISBN(), getPages());
    }
}
