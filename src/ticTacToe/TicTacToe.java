package ticTacToe;

import javaLU.lambda.Main.Jframe.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {
    JFrame frame;


    TicTacToe() {
        frame = new JFrame("Tic Tac Toe");

        try {

            frame.setSize(600, 600);
            frame.setVisible(true);
            Thread.sleep(1000);
            frame.setLayout(new GridLayout(3,3));
            for (int i = 0; i < 9; i++) {
                JButton button = new JButton("click");
                button.setFont(new Font("Arial", Font.PLAIN, 60));
                frame.add(button);
            }
            frame.setLocationRelativeTo(null);
            // Center the window on the screen
            frame.setVisible(true);
        } catch(InterruptedException e){
            System.out.println("Program is interrupted");
            e.getStackTrace();
        }

    }

    private  ListenerForButtonClick(ActionEvent e, JButton button){
        JButton clickedButton = (JButton) e.getSorce();
    }


    public static void main(String[] args) {
        new TicTacToe(); // Create an instance of the frame
    }
}

