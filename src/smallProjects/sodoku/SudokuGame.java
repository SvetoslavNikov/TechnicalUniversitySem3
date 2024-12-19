package smallProjects.sodoku;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuGame extends JFrame {
    private final JTextField[][] cells = new JTextField[9][9];
    private final Board board;

    public SudokuGame() {
        board = new Board();
        setTitle("Sudoku Game");
        setLayout(new GridLayout(9, 9));



        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col] = new JTextField();
                cells[row][col].setHorizontalAlignment(JTextField.CENTER);
                cells[row][col].setFont(new Font("Arial", Font.PLAIN, 24));
                cells[row][col].setEditable(true);
                add(cells[row][col]);
            }
        }


        JButton submitButton = new JButton("Submit Move");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitMove();
            }
        });

        add(submitButton);


        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void submitMove() {
        try {
            int row = Integer.parseInt(JOptionPane.showInputDialog("Enter row (0-8):"));
            int col = Integer.parseInt(JOptionPane.showInputDialog("Enter column (0-8):"));
            int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number (1-9):"));

            if (board.isValidMove(row, col, number)) {
                board.makeMove(row, col, number);
                cells[row][col].setText(String.valueOf(number));
            } else {
                JOptionPane.showMessageDialog(this, "Invalid move! Try again.");
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid row, column, and number.");
        }
    }

    public static void main(String[] args) {
        new SudokuGame();
    }
}
