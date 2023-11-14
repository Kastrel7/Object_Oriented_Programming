package Lab10.Exc4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output = "";

        BankAccount account1 = new BankAccount();

        output += "Calling the no-argument BankAccount constructor. " +
                "The first BankAccount object details are: \n\n" + account1.toString();

        BankAccount account2 = new BankAccount("Richy Rich",2342343,0.75);

        output += "\n\nCalling the multi-argument BankAccount constructor. " +
                "The second BankAccount object details are: \n\n" + account2.toString();

        BankAccount.setInterestRate(0.5);

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5. " +
                "\n\nThe first BankAccount object details are: \n\n" + account1.toString() +
                "\n\nThe second BankAccount object details are: \n\n" + account2.toString();

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
