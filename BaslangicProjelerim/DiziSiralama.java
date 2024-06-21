import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen sayi adedini giriniz");
        int sayiAdet = klavye.nextInt();
        int[] sayilar = new int[sayiAdet];
        for (int k = 0; k < sayilar.length; k++) {
            System.out.println("Lütfen " + (k + 1) + "• sayiyi giriniz");
            sayilar[k] = klavye.nextInt();
        }
        for (int i = 0; i < sayiAdet - 1; i++) {
            for (int j = 0; j < sayiAdet - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int gecici = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = gecici;
                }
            }
        }
        System.out.println("Kücükten büyüge siralama");
        for (int k = 0; k < sayilar.length; k++) {
            System.out.println(sayilar[k]);
        }
    }
}