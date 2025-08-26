package project7;

import java.awt.*;
import javax.swing.*;

public class Sample5_1{
    public static void main(String[] args) {
        JTextField jtf=new JTextField(20);
        JFrame frame=new JFrame();
        
        
        JLabel jl= new JLabel("Text");
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setVerticalTextPosition(JLabel.TOP);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JPanel panel=new JPanel(new BorderLayout());
        jtf.setBounds(2, 2, 2, 2);
        
        
        panel.add(jl, BorderLayout.NORTH);
        panel.add(jtf,BorderLayout.CENTER);
        
        
        
        
        
        
        
        
        frame.add(panel);
        frame.setVisible(true);
    }
}