import javax.swing.*;

public class JFrameOrnek {
    public static void main(String[] args) {
        // f adında yeni bir frame nesnesi üretiliyor
        JFrame f = new JFrame("JFrame Çerçevesi");
        // frame boyut ayarlanıyor
        f.setSize(450, 450);
        // frame ekranındaki konum ayarlanıyor
        // f.setLocation(300, 300);
        // pencere kapatma işlemi tanımlanıyor
        // çıkışta kapat seçeneği belirleniyor
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // görünüm true yapılıyor
        f.setVisible(true);
    }
}