import java.util.Scanner;

public class SayiTahmin2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        // Doğru sayı rastgele tanımlanıyor.
        int dogruSayi = (int) (Math.random() * 100);
        int tahmin;
        System.out.println("1 ila 100 arasında bir sayı tahmin ediniz.");
        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = klavye.nextInt();
            if (tahmin < dogruSayi) {
                System.out.println("Daha büyük bir sayı tahmin ediniz.");
            } else if (tahmin > dogruSayi) {
                System.out.println("Daha küçük bir sayı tahmin ediniz.");
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
            }
        } while (tahmin != dogruSayi);
    }
}
