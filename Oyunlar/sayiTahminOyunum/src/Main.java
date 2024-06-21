
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);

        Random random = new Random(); //random sınıfından bir nesne oluşturduk.
        int randomSayi = (int) (Math.random()*100)+1; //alt sınır dahil, üst sınır değil.


        int tahmin;
        int hak = 5;

        System.out.println("Tahminini gir !");
        do {

            tahmin = sayi.nextInt();
            //System.out.println("Tahminin: " + tahmin);

            if (tahmin<0  ||   tahmin>100) {
                System.out.println("Girilen Sayı 0-100 Arasında Değil  " + "Tekrar Bir Sayı Gir");
                continue;
            }

            if (tahmin < randomSayi) {
                hak = hak - 1;
                System.out.println("Tahminini Büyült  " + "Kalan Hak:  " + hak);

            } else if (tahmin > randomSayi) {
                hak = hak - 1;
                System.out.println("Tahminini Küçült  " + " Kalan Hak: " + hak);

            } else if (tahmin == randomSayi) {
                System.out.println("Tebrikler Tahmin Doğru ");
            }
            if (hak<1){
                System.out.println("Hakkınız Bitti !");
                break;
            }
        }
        while (tahmin != randomSayi);

        }
    }






