
import javax.swing.*;
import java.awt.*;
public class PanelleCizim extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("Merhaba, Java!", 150, 200);
    }
}
