import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ButonTiklama {
    public static void main(String[] args) {
        Frame f = new Frame("Buton Tıklama Örnek");
        Button btnRenkli = new Button("Tıklayınız");
        btnRenkli.setBounds(130, 150, 100, 60);
        btnRenkli.setBackground(Color.red);

        btnRenkli.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Random rand = new Random();
                        float r = rand.nextFloat();
                        float g = rand.nextFloat();
                        float b = rand.nextFloat();

                        btnRenkli.setBackground(new Color(r, g, b));
                        btnRenkli.setFont(new Font("Arial", Font.BOLD, 18));
                    }
                }
        );
        f.add(btnRenkli);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

    }
}