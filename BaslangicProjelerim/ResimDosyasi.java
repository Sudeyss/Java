import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResimDosyasi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resim ve Metin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            // Kullanıcı adı
            String kullaniciAdi = "soylu";
            
            // Masaüstü dosya yolu
            String dosyaYolu = "C:\\Users\\" + kullaniciAdi + "\\Desktop\\kalp.jpg"; // Windows için
            
            // Resmi oku
            File file = new File(dosyaYolu);
            Image image = ImageIO.read(file);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, null); // Resmi çiz

                    // Metinleri ekle
                    g.setColor(Color.BLACK);
                    Font font = new Font("Arial", Font.BOLD, 18);
                    String topText = "Üstteki Yazı";
                    String bottomText = "Altta Yazan";
                    g.setFont(font);
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
