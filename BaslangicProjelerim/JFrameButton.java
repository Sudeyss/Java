import javax.swing.*;

public class JFrameButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buton Örneği"); // JFrame nesnesi oluşturuluyor
        JButton b = new JButton("Tıkla"); // JButton nesnesi oluşturuluyor
        b.setBounds(130, 100, 100, 40); // x ekseni, y ekseni, genişlik, yükseklik
        f.add(b); // JButton nesnesi JFrame nesnesine ekleniyor
        f.setSize(400, 500);
        // f.setLayout(null); // Layout manager kullanılmıyor
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); // frame görünür yapılıyor
    }
}