import java.util.Scanner;
import java.util.*;

public class SayiTahmin {
    public static void main(String[] args) {
        int rastgeleSayi = (int) (Math.random() * 10);
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen 0-10 arasında bir tam sayı giriniz ");
        //Klavyeden alınan değer int olarak alınıyor
        int tahmin = klavye.nextInt();

        if (tahmin <= 10 && 0 <= tahmin) {
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler");
            } else {
                System.out.println("Bilemediniz");
            }
        } else {
            System.out.println("Girilen sayı " + tahmin + " 0-10 arasında değil");
        }
    }
}
