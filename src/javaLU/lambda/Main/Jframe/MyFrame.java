package javaLU.lambda.Main.Jframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("MyButton");
    JCheckBox myNewButton = new JCheckBox("Check me");

    MyFrame() {

        myButton.setBounds(50, 50, 200, 100);

        //anonymous class pointless in functional interface in this case
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked myButton baby");
            }
        });

        //lambda
        myNewButton.addActionListener((e) -> {
                System.out.println("Uh check me out");
            })
        ;

        myNewButton.setSize(100,100);
        myNewButton.setLocation(300, 200);
        this.add(myNewButton);
        this.add(myButton); // Add button to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Use no layout managers
        this.setSize(420, 420); // Set size of the frame
        this.setVisible(true); // Make frame visible
    }



    public static void main(String[] args) {
        new MyFrame(); // Create an instance of the frame
    }
}
