package FirstOOPCA2021.assesment;

import javax.swing.*;
import java.util.Arrays;

public class Book {
    private String ISBN;
    private String title;
    private String publisher;
    private Author[] authors;
    private int numberCopies;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
        if (numberCopies < 0) {
            JOptionPane.showMessageDialog(null, "Number of copies must be positive!!!", "Bad Input", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public Book(String ISBN, String title, String publisher, Author[] authors, int numberCopies){
        setISBN(ISBN);
        setTitle(title);
        setPublisher(publisher);
        setAuthors(authors);
        setNumberCopies(numberCopies);
    }

    public String toString(){
        String str = String.format("ISBN: " + getISBN() + "  Title: " + getTitle() + "  Publisher: " + getPublisher() + "  Author(s): " + Arrays.toString(getAuthors()) + "  Number of Copies: " + getNumberCopies());
        return str;
    }
}
