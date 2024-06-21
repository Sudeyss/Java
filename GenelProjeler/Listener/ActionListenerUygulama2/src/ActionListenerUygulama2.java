import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class ActionListenerUygulama2 {

    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Metin kutusu Örneği");
        JTextField metinAlani = new JTextField(20);
        JButton dugme = new JButton("Metin Ekle");

        dugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] isimler = {"Burak","Ayşe","Ebru","Merve","Serra","Ahmet","Mert","Zeynep","Neslişah","Nil"};
                Random r = new Random();
                int isimNo = r.nextInt(isimler.length);
                metinAlani.setText("Merhaba " + isimler[isimNo] );
            }
        });

        cerceve.setLayout(new java.awt.FlowLayout());
        cerceve.add(metinAlani);
        cerceve.add(dugme);
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}
