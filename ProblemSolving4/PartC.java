package ProblemSolving4;

import javax.swing.*;
import java.awt.*;

public class PartC {
    public static void main(String[] args){
        String[] board = new String[100];
        boolean gameOn;
        String playerType;
        int humanPosition = 0, compPosition = 0;
        generateInitialBoard(board);
        displayBoard(board);
        JOptionPane.showMessageDialog(null, "On the game-board the human player will have the symbol ⏹ while the computer player will have the symbol ⏺");
        int round = 0;

        do{
            generateInitialBoard(board);
            round++;
            playerType = "human";
            humanPosition = diceRoll(playerType, humanPosition, round, board);
            if (compPosition >= 100){
                gameOn = false;
                break;
            }
            playerType = "computer";
            compPosition = diceRoll(playerType, compPosition, round, board);
            if (humanPosition >= 100){
                gameOn = false;
                break;
            }
            displayBoard(board);
        }while(gameOn = true);

        JOptionPane.showMessageDialog(null, String.format("The game is over and the winner is %s", playerType), "Result", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public static void generateInitialBoard(String[] board) {
        for (int x = 0; x < 100; x++) {
            board[x] = "⬜";
        }
        board[7] = board[19] = board[22] = board[27] = board[30] = board[41] = board[52] = board[59] = board[66] = board[73] = board[80] = board[85] = "⯆";
        board[11] = board[16] = board[23] = board[33] = board[38] = board[50] = board[57] = board[68] = board[75] = board[84] = board[89] = board[92] = board[98] = "⯅";
    }

    public static void displayBoard(String[] board){
        JTextArea  textArea = new JTextArea(1,1);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 20);
        textArea.setFont(textAreaFont);
        for (int x = 0; x < 100; x++){
            textArea.append(String.format("%-3s", board[x]));
            if ((x-9)%10 == 0) {
                textArea.append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, textArea, "Game Board", JOptionPane.PLAIN_MESSAGE);
    }

    public static int diceRoll(String playerType, int playerPosition, int round, String[] board){
        int[] down = {12, 17, 24, 34, 39, 51, 58, 69, 76, 85, 90, 93, 99}, up = {8, 20, 23, 28, 31, 42, 53, 60, 67, 74, 81, 86};
        JOptionPane.showMessageDialog(null, String.format("Round %d - %s's turn\n\nThrow the dice to generate a number between 2 and 12 inclusive", round, playerType));
        int playerDice1 = (int) (Math.random() * 6) + 1;
        int playerDice2 = (int) (Math.random() * 6) + 1;
        int playerRoll = playerDice1 + playerDice2;
        JOptionPane.showMessageDialog(null, String.format("You rolled a %d", playerRoll));
        playerPosition = playerPosition + playerRoll;

        for (int i : up) {
            if (playerPosition == i) {
                playerPosition = playerPosition + 10;
            }
        }
        for (int i : down) {
            if (playerPosition == i) {
                playerPosition = playerPosition - 10;
            }
        }
        if(playerPosition < 100 && playerType == "human"){
            board[playerPosition-1] = "⏹";
        }
        else if(playerPosition >= 100 && playerType == "human"){
            board[99] = "⏹";
        }
        else if(playerPosition < 100 && playerType == "computer"){
            board[playerPosition-1] = "⏺";
        }
        else if(playerPosition >= 100 && playerType == "computer"){
            board[99] = "⏺";
        }
        System.out.println(playerType + " is at " + playerPosition);
        return playerPosition;
    }
}
