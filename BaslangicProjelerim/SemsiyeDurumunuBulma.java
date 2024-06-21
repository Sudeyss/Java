import java.util.Scanner;

public class SemsiyeDurumunuBulma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int Sicaklik, Nem;
        System.out.println("Lütfen Sıcaklık Değerini Giriniz");
        Sicaklik = klavye.nextInt();
        System.out.println("Lütfen Nem Değerini Giriniz");
        Nem = klavye.nextInt();

        if ((7 <= Sicaklik) && (Sicaklik <= 15) && (65 <= Nem) && (Nem <= 75)) {
            System.out.println("Hava Durumu Yağışlıdır Şemsiye Alınız");
        } else if ((15 <= Sicaklik) && (Sicaklik <= 19) && (30 <= Nem) && (Nem <= 60)) {
            System.out.println("Hava Durumu Yağışlı Değil Şemsiye Almayınız");
        } else if ((20 <= Sicaklik) && (Sicaklik <= 25) && (45 <= Nem) && (Nem <= 80)) {
            System.out.println("Hava Durumu Yağışlıdır Şemsiye Alınız");
        } else if ((1 <= Sicaklik) && (Sicaklik <= 6) && (30 <= Nem) && (Nem <= 50)) {
            System.out.println("Hava Durumu Yağışlı Değil Şemsiye Almayınız");
        } else {
            System.out.println("Hava durumu belirtilen aralıkların dışında.");
        }
    }
}