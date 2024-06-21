import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerUygulama3 {

    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Arkaplan Renk Örneği");
        JButton dugme = new JButton("Renk Değiştir");

        dugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color[] renkler = {Color.YELLOW, Color.BLUE, Color.RED,
                        Color.MAGENTA, Color.ORANGE, Color.CYAN};
                Random r = new Random();
                int renkNo = r.nextInt(renkler.length);
                cerceve.getContentPane().setBackground(renkler[renkNo]);
            }
        });

        cerceve.setLayout(new java.awt.FlowLayout());
        cerceve.add(dugme);
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}