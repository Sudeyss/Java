import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class FareDurum extends JFrame implements MouseMotionListener {

    public FareDurum() {
        addMouseMotionListener(this);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FareDurum();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Fare (" + e.getX() + ", " + e.getY() + ") konumuna sürüklendi.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Fare (" + e.getX() + ", " + e.getY() + ") konumuna taşındı.");
    }
}
