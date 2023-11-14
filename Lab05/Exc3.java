package Lab05;

import javax.swing.*;

public class Exc3 {

    public static char rollTheDice(){
        int compNum1 = (int) (Math.random() * 6) + 1;
        int compNum2 = (int) (Math.random() * 6) + 1;
        int compNum = compNum1 + compNum2;
        JOptionPane.showMessageDialog(null, String.format("The computer roll generated the value %d\n.... now hit return to see the player roll", compNum), "Computer Roll", JOptionPane.INFORMATION_MESSAGE);

        int userNum1 = (int) (Math.random() * 6) + 1;
        int userNum2 = (int) (Math.random() * 6) + 1;
        int userNum = userNum1 + userNum2;
        JOptionPane.showMessageDialog(null, String.format("The player roll generated the value %d", userNum), "Player Roll", JOptionPane.INFORMATION_MESSAGE);

        char winner = 'a';

        if (compNum > userNum){
            winner = 'c';
        }
        else if (userNum > compNum){
            winner = 'p';
        }
        else if (userNum == compNum) {
            winner = 'd';
        }
        return winner;
    }

    public static void main(String[] args){

        int userWins = 0, compWins = 0, games = 0, draw = 0;

        while(true) {

            String yesNo = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yer or no)");

            if (yesNo.equals("yes")) {

                //rollTheDice();
                games++;
                switch(rollTheDice()){
                    case 'c':
                        compWins++;
                        break;
                    case 'p':
                        userWins++;
                        break;
                    case 'd':
                        draw++;
                        break;
                }
                JOptionPane.showMessageDialog(null, String.format("Games Played: %d\n" +
                        "Computer Wins: %d\n" +
                        "Player Wins: %d\n" +
                        "Draws: %d",
                        games, compWins, userWins, draw), "Games Info", JOptionPane.INFORMATION_MESSAGE);

                continue;
            }
            else if (yesNo.equals("no")){
                JOptionPane.showMessageDialog(null, String.format("Thanks for playing the game!"), "Farewell", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
