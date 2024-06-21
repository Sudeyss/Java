import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;

public class FareCizim extends JFrame implements MouseListener {
    int R = 10, G = 10, B = 10;
    Random rastgele = new Random();

    FareCizim() {
        addMouseListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        R = rastgele.nextInt(255);
        G = rastgele.nextInt(255);
        B = rastgele.nextInt(255);
        Graphics g = getGraphics();
        g.setColor(new Color(R, G, B));
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        new FareCizim();
    }
}
