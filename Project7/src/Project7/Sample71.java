package project7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample71 extends JFrame {
    private JTextField inputField;

    public Sample71() {
        setTitle("User Input GUI");
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a panel to hold components
        JPanel panel = new JPanel(new BorderLayout());

        // Create a label
        JLabel label = new JLabel("Enter your name:");

        // Create a text field
        inputField = new JTextField(4);
        inputField.setPreferredSize(new Dimension(30,20));

        // Create a button
        JButton submitButton = new JButton("Submit");

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve text from the text field
                String userInput = inputField.getText();

                // Display a message dialog with the user input
                JOptionPane.showMessageDialog(Sample71.this, "Hello, " + userInput + "!");
            }
        });

        // Add components to the panel
        panel.add(label, BorderLayout.NORTH);
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(submitButton, BorderLayout.SOUTH);

        // Add panel to the frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sample71();
            }
        });
    }
}
