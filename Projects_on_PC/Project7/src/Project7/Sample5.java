package project7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Sample5 {
    
    public static void main(String[] args) {
        
        
//        JPanel panel=new JPanel();
        JLabel label=new JLabel();
//        panel.add(label);
        ImageIcon bimage=new ImageIcon("logos/enkey small.png");
        label.setText("Text Encryption Tool");
        label.setIcon(bimage);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("OCR A Std",Font.BOLD,20 ));
        label.setForeground(new Color(8,152,125,255));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        
        
        
        JFrame jf=new JFrame();
        jf.setSize(400,400);
        jf.setTitle("Text Encryptor");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        
        ImageIcon image=new ImageIcon("logos/1211.png");
        jf.setIconImage(image.getImage());
        jf.add(label);
//        jtf.setBounds(10);
        
        jf.setVisible(true);
        
        
        
        

        
        
        
        
    }
}

