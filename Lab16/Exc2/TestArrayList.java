package Lab16.Exc2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList{
    public static void main(String[] args) {

        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen", "This is a black pen");
        Product p12 = new Product(12, "Blue Pen", "This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");
        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15));

        int choice;


        do {
            choice  = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products\n5. Quit\n\nPlease enter your choice"));
            while(choice < 1 || choice > 5){
                choice  = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products\n5. Quit\n\nInvalid choice entered!! Must be between 1 and 5 inclusive"));
            }
            switch (choice) {
                case 1:
                    addProduct(allProducts);
                    break;
                case 2:
                    amendProduct(allProducts);
                    break;
                case 3:
                    removeProduct(allProducts);
                    break;
                case 4:
                    viewProducts(allProducts);
            }
        }while(choice != 5);
        JOptionPane.showMessageDialog(null, "Thanks for using the system!", "Farewell", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

    public static void addProduct(ArrayList<Product> allProducts) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String name = JOptionPane.showInputDialog("Please enter the product name");
        String description = JOptionPane.showInputDialog("Please enter the product description");
        Product p = new Product(id, name, description);
        allProducts.add(p);
        JOptionPane.showMessageDialog(null, "Product now created and added to array list!");
    }
    public static void amendProduct(ArrayList<Product> allProducts) {
        ArrayList<Product> found = new ArrayList<Product>();
        String name = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");
        String text = "The following products matched your search phrase\n\n";
        for (Product p:allProducts){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(p);
            }
        }
        for (Product p:found){
            text += p + "\n";
        }
        text += "\n\nEnter the id of the item you want to amend";
        int id = Integer.parseInt(JOptionPane.showInputDialog(text));
        for (Product p:found){
            if (p.getId() == id){
                int choice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" + p + "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amendment\n\nPlease enter your choice"));
                while(choice < 1 || choice > 3){
                    choice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" + p + "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amendment\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive"));
                }
                switch(choice){
                    case 1:
                        String newName = JOptionPane.showInputDialog("Please enter the new name for the product");
                        p.setName(newName);
                        break;
                    case 2:
                        String newDes = JOptionPane.showInputDialog("Please enter the new description for the product");
                        p.setDescription(newDes);
                        break;
                }
                JOptionPane.showMessageDialog(null,"Product details now amended!", "Product Amended",JOptionPane.INFORMATION_MESSAGE);
                found.clear();
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "This ID was not listed", "Error!", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }


    }
    public static void removeProduct(ArrayList<Product> allProducts) {
        ArrayList<Product> found = new ArrayList<Product>();
        String name = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");
        String text = "The following products matched your search phrase\n\n";
        for (Product p:allProducts){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(p);
            }
        }
        for (Product p:found){
            text += p + "\n";
        }
        text += "\n\nEnter the id of the item you want to remove";
        int id = Integer.parseInt(JOptionPane.showInputDialog(text));
        for (Product p:found){
            if (p.getId() == id){
                int choice = JOptionPane.showConfirmDialog(null,"The details of the product you wish to amend are:\n\n" + p + "\n\nAre you sure you wish to remove this product?","Product Removal Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
                if(choice==JOptionPane.YES_OPTION) {
                    allProducts.remove(p);
                    JOptionPane.showMessageDialog(null, "Product now removed from array list!",
                            "Product Removed", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Product removal canceled",
                            "Product Not Removed", JOptionPane.INFORMATION_MESSAGE);

                found.clear();
            }
        }
    }

    public static void viewProducts(ArrayList<Product> allProducts) {
        String text = "";
        for (Product p:allProducts){
            text += p + "\n";
        }
        JOptionPane.showMessageDialog(null, text, "List of all Products", JOptionPane.INFORMATION_MESSAGE);
    }
}
