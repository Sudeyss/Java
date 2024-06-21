import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SekilCizici extends JPanel {
    private Color[] renkler = new Color[5];

    public SekilCizici() {
        Random random = new Random();
        for (int i = 0; i < renkler.length; i++) {
            renkler[i] = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //aşağıdaki kod kare içindir
        g.setColor(renkler[0]);
        g.fillRect(50, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("Kare", 85, 170);//bu satır şekili belirtmekte

        //aşağıdaki kod dikdörtgen içindir
        g.setColor(renkler[1]);
        g.fillRect(200, 50, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Dikdörtgen", 250, 170);

        //aşağıdaki kod elips içindir
        g.setColor(renkler[2]);
        g.fillOval(400, 50, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Elips", 465, 170);

        //aşağıdaki kod daire içindir
        g.setColor(renkler[3]);
        g.fillOval(600, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("Daire", 640, 170);

        //aşağıdaki kod üçgen içindir (öncelikle 3 köşe kordinatları belli edilmeli )
        g.setColor(renkler[4]);
        Polygon ucgen = new Polygon();
        ucgen.addPoint(400, 250);
        ucgen.addPoint(375, 350);
        ucgen.addPoint(425, 350);
        g.fillPolygon(ucgen);
        g.setColor(Color.BLACK);
        g.drawString("Üçgen", 385, 370);

    }
}
