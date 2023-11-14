package Lab09.Exc5;

import javax.swing.*;
import java.awt.*;

public class TestBook {

    public static void main(String[] args){
        String text = String.format("%-25s%-10s%-25s%s\n\n", "Title", "Price", "ISBN", "Pages");

        String title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        String ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        int pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));

        Book favBook = new Book(title, price, ISBN, pages);

        text += favBook.toString();

        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book leastFavBook = new Book(title, price, ISBN, pages);

        text += leastFavBook.toString();

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));

        textArea.setText(text);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
