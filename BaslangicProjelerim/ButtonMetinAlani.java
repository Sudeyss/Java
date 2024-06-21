import java.awt.event.*;
import javax.swing.*;

public class ButtonMetinAlani {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buton Metin Kutusu");
        JTextField tf = new JTextField("sa");
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Tıklayınız");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}