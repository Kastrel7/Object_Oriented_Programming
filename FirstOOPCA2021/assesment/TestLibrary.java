package FirstOOPCA2021.assesment;

import javax.swing.*;
import java.awt.*;

public class TestLibrary {
    public static void main(String[] args){
        Author a1 = new Author("Harvey", "Deitel");
        Author a2 = new Author("Brian", "Kernigham");
        Author a3 = new Author("Robert", "Martin");
        Author a4 = new Author("Quentin", "Charatan");
        Author a5 = new Author("Paul", "Deitel");
        Author a6 = new Author("Aaron", "Kans");
        Author a7 = new Author("C. Thomas", "Wu");
        Author a8 = new Author("Jeffery", "Listfield");
        Author a9 = new Author("Dennis", "Ritchie");
        Author a10 = new Author("Bjarne", "Stroustrup");

        Book b1 = new Book("0131103628", "The C Programming Language", "Prentice Hall", new Author[]{a2, a9}, 6);
        Book b2 = new Book("0132350884", "Clean Code", "Prentice Hall", new Author[]{a3}, 5);
        Book b3 = new Book("3319994190", "Java in Two Semesters", "Springer", new Author[]{a4,a6}, 8);
        Book b4 = new Book("0132222205", "C#: How to Program", "Pearson", new Author[]{a1,a5,a8}, 6);
        Book b5 = new Book("0073523305", "An Introduction to Object Oriented Programming with Java", "McGraw-Hill", new Author[]{a7},3);

        Book[] books = new Book[100];

        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        books[4] = b5;

        Library l1 = new Library("MTU Kerry Library", "Dromtacker, Tralee, Co. Kerry", "Pat Doherty", 13, books);
        JOptionPane.showMessageDialog(null, l1, "Library Details", JOptionPane.INFORMATION_MESSAGE);

        //String seek = JOptionPane.showInputDialog("Please enter the title of the book you seek");
        //JOptionPane.showMessageDialog(null, "The details of this book are as follows:\n\n"+l1.findBook(seek), "Book found", JOptionPane.INFORMATION_MESSAGE);

        Book b6 = new Book("0131103628", "The C Programming Language", "Prentice Hall", new Author[]{a2,a9}, 3);
        Book b7 = new Book("0134997832", "A Tour Of C++", "Pearson", new Author[]{a10}, 5);

        l1.addBook(b6);
        l1.addBook(b7);

        //JOptionPane.showMessageDialog(null, l1, "Library Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
