import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ResimMetin {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resim ve Metin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            URL imageUrl = new URL("https://www.pngwing.com/tr/free-png-yswdr"); // Resmin URL'si
            Image image = ImageIO.read(imageUrl); // Resmi oku

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, null); // Resmi çiz
                    g.setColor(Color.BLACK);
                    Font font = new Font("Arial", Font.BOLD, 18);
                    g.setFont(font);
                    String topText = "RABİA";
                    String bottomText = "SENİ ÇOK SEVİYORUM";
                    g.drawString(topText, 20, 30); // Üstteki yazıyı ekle
                    g.drawString(bottomText, 20, image.getHeight(null) - 20); // Altta yazanı ekle
                }
            };

            frame.getContentPane().add(panel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.pack();
        frame.setVisible(true);
    }
}
