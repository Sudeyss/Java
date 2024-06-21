import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Timer;
import java.util.TimerTask;

public class Animasyon {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animasyon");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null); // Layout manager'ı null yaparak özelleştirilmiş konumlar için kullanacağız
            frame.setLocationRelativeTo(null);

            JLabel centerLabel = new JLabel();
            centerLabel.setFont(new Font("Arial", Font.PLAIN, 30));
            centerLabel.setHorizontalAlignment(JLabel.CENTER);
            frame.add(centerLabel);
            centerLabel.setBounds(0, frame.getHeight() / 2 - 25, frame.getWidth(), 50); // Yazıyı tam ortaya sabitleme

            frame.setVisible(true);

            addHearts(frame);
            animateSevgi(centerLabel, frame);
        });
    }

    private static void addHearts(JFrame frame) {
        addHeart(frame, 20, 20); // Sol üst köşe
        addHeart(frame, frame.getWidth() - 120, 20); // Sağ üst köşe
        addHeart(frame, 20, frame.getHeight() - 120); // Sol alt köşe
        addHeart(frame, frame.getWidth() - 120, frame.getHeight() - 120); // Sağ alt köşe
    }

    private static void addHeart(JFrame frame, int x, int y) {
        HeartPanel heart = new HeartPanel();
        frame.add(heart);
        placeHeart(frame, heart, x, y); // Kalp konumlandırma
    }

    private static void placeHeart(Component parent, Component component, int x, int y) {
        component.setBounds(x, y, 100, 100); // Kalp boyutu ve konumu
    }

    private static void animateSevgi(JLabel label, JFrame frame) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            boolean visible = true;

            public void run() {
                SwingUtilities.invokeLater(() -> {
                    label.setText(visible ? "Rabia Seni Çokkk Seviyorum" : "");
                    visible = !visible;
                    frame.repaint();
                });
            }
        }, 0, 800); // Yanıp sönme hızı (milisaniye cinsinden)
    }

    static class HeartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();

            int x = getWidth() / 2 - 25;
            int y = getHeight() / 2 - 30; // Y koordinatını değiştirerek kalbi yukarı taşıyoruz

            // Kalp çizimi
            GeneralPath path = new GeneralPath();
            path.moveTo(x, y);
            path.curveTo(x, y - 40, x - 40, y - 40, x - 40, y);
            path.curveTo(x - 40, y + 40, x, y + 80, x + 40, y);
            path.curveTo(x + 40, y - 40, x, y - 10, x, y);

            g2d.setColor(Color.RED);
            g2d.fill(path);
            g2d.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(100, 100);
        }
    }
}
