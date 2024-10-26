package javaLU.lambda.Main.Jframe;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private boolean isXTurn = true;

    public TicTacToe() {
        this.setTitle("Tic-Tac-Toe");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            this.add(buttons[i]);
        }

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (!clickedButton.getText().equals("")) {
            return; // Ignore click if the button is already used
        }

        clickedButton.setText(isXTurn ? "X" : "O");
        isXTurn = !isXTurn;

        checkForWinner();
    }

    private void checkForWinner() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = buttons[i].getText();
        }

        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (checkLine(board[i][0], board[i][1], board[i][2]) ||
                    checkLine(board[0][i], board[1][i], board[2][i])) {
                showWinner(board[i][i]);
                return;
            }
        }

        if (checkLine(board[0][0], board[1][1], board[2][2]) ||
                checkLine(board[0][2], board[1][1], board[2][0])) {
            showWinner(board[1][1]);
            return;
        }

        // Check for draw
        boolean draw = true;
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                draw = false;
                break;
            }
        }

        if (draw) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            resetBoard();
        }
    }

    private boolean checkLine(String s1, String s2, String s3) {
        return !s1.equals("") && s1.equals(s2) && s2.equals(s3);
    }

    private void showWinner(String winner) {
        JOptionPane.showMessageDialog(this, winner + " wins!");
        resetBoard();
    }

    private void resetBoard() {
        for (JButton button : buttons) {
            button.setText("");
        }
        isXTurn = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
