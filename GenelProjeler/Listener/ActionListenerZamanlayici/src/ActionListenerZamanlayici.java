import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ActionListenerZamanlayici {

    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Zamanlayıcı Örnek");
        JLabel etiket = new JLabel("Zaman: 0", SwingConstants.CENTER);
        cerceve.add(etiket);
        Timer zamanlayici;

        zamanlayici = new Timer(1000, new ActionListener() {
            int sayici = 0;

            public void actionPerformed(ActionEvent e) {
                sayici++;
                Color[] renkler = {Color.YELLOW, Color.RED};
                cerceve.getContentPane().setBackground(renkler[(sayici % 2)]);
                String etiketMetin = (sayici % 2 == 0) ? "ŞAMPİYON GALATASARAY" : "Zaman: " + sayici;
                etiket.setText(etiketMetin);
            }
        });

        zamanlayici.start();
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}