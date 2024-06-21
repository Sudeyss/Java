
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("Basit Çizim");
        PanelleCizim cizim1 = new PanelleCizim();
        TuvalleCizim cizim2 = new TuvalleCizim();
        pencere.add(cizim1);
        pencere.setSize(400, 400);
        pencere.add(cizim2);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
}
