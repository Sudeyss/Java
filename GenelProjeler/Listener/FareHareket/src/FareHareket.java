
import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class FareHareket extends JFrame implements MouseListener {
    Label etiket;

    FareHareket() {
        addMouseListener(this);
        etiket = new Label();
        etiket.setBounds(50, 50, 200, 50);
        etiket.setBackground(Color.red);
        add(etiket);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FareHareket();
    }

    public void mouseClicked(MouseEvent e) {
        etiket.setText("Fare Tıklandı");
    }

    public void mouseEntered(MouseEvent e) {
        etiket.setText("Fare Pencere Üzerine Geldi " + e.getX() + " " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        etiket.setText("Fare Pencere Üzerinden Çıktı");
    }

    public void mousePressed(MouseEvent e) {
        etiket.setText("Fare Basıldı");
    }

    public void mouseReleased(MouseEvent e) {
        etiket.setText("Fare Bırakıldı");
        System.out.println("Fare Bırakıldı");
    }
}
