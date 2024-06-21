import javax.swing.*;

public class SecenekKutusu1 {
    public static void main(String[] args) {
        // Klavyeden giriş için seçenek kutusu gösteriliyor
        String girilenDeger = JOptionPane.showInputDialog("Sayı giriniz");
        System.out.println(girilenDeger);
        // iptal'e tıklanırsa girilenDeger null değeri alıyor
        if (girilenDeger != null) {
            //Integer sınıfında parseInt metodu ile tür dönüşümü yapılıyor
            int Sayi = Integer.parseInt(girilenDeger);
            // seçenek kutusunun mesaj görüntüleme metodu kullanılıyor
            JOptionPane.showMessageDialog(null, "Girilen Sayı: " + Sayi);
        } else {
            //girilenDeger null ise progradan çıkış yapılıyor
            System.exit(0);
        }

    }
}