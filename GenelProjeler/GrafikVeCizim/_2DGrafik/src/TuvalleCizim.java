import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class TuvalleCizim extends Canvas{
    public void paint(Graphics g) {
        g.drawString("Hello",40,40);
        setBackground(Color.WHITE);
        g.fillRect(130,30,100,80);
        g.drawOval(30,130,50,60);
        setForeground(Color.RED);
        g.fillOval(130,130,50,60);
        g.drawArc(30,200,40,50,90,60);
        g.fillArc(30,130,40,50,180,40);
        g.drawLine(40,40,190,190);
    }
}
