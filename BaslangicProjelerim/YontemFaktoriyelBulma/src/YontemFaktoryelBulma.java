import java.util.Scanner;

public class YontemFaktoryelBulma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen Faktoriyel Sayısını Giriniz: ");
        int sayı = klavye.nextInt();
        int sonuc = faktorıyel(sayı);
        System.out.println(sayı + "! :" + sonuc);


    }

    public static int faktorıyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorıyel(n - 1);
        }
    }
}

