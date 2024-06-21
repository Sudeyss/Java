import java.util.Scanner;

public class SayiTahmin3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        // Doğru sayı rastgele tanımlanıyor.
        int dogruSayi = (int) (Math.random() * 100) + 1;
        int tahmin;
        int hak = 6;
        int puan = 100;
        System.out.println("1 ile 100 arasında bir sayı tahmin ediniz. Çıkmak için 0 giriniz:");
        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = klavye.nextInt();
            if (tahmin == 0) {
                System.out.println("Yine bekleriz");
                break;
            }
            if (tahmin < dogruSayi) {
                hak--;
                puan = puan - 10;
                System.out.println("Daha büyük bir sayı tahmin ediniz. Kalan hak: " + hak);
            } else if (tahmin > dogruSayi) {
                puan = puan - 10;
                hak--;
                System.out.println("Daha küçük bir sayı tahmin ediniz. Kalan hak: " + hak);
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz. " + puan + " puan ile bitirdiniz;");
            }
            if (hak < 1) {
                System.out.println("Hakkınız bitti. Doğru sayı: " + dogruSayi + ". " + puan + " puan ile oyun sonlandırıldı.");
                break;
            }
        } while (tahmin != dogruSayi);
    }
}
