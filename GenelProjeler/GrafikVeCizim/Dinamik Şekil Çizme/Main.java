import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("Çizime Başla!" + "  (Çizim Bitince Şekil Oluşacak)");
        SekilOlusturucu panel = new SekilOlusturucu();

        JButton dikdortgenButon = new JButton("Dikdörtgen");
        //dikdortgenButon butonuna tıklanınca panel nesnesinin sekilTuru özelliği dikdortgen olur.(aşağıdaki)
        dikdortgenButon.addActionListener(e -> panel.sekilTuru = "dikdortgen");
        JButton cizgiButon = new JButton("Çizgi");
        cizgiButon.addActionListener(e -> panel.sekilTuru = "cizgi");
        JPanel butonPaneli = new JPanel();
        butonPaneli.add(dikdortgenButon);
        butonPaneli.add(cizgiButon);
        pencere.add(panel, BorderLayout.CENTER); //paneli merkeze ekler
        pencere.add(butonPaneli, BorderLayout.NORTH); //buton panelini üst kısma ekler
        pencere.setSize(800, 600);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setLocationRelativeTo(null); // pencerenin ekranın ortasına sabitlenmesi içindir!
        pencere.setVisible(true);
    }
}

