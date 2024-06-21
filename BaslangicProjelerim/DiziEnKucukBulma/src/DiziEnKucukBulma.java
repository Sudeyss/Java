import java.util.Scanner;
public class DiziEnKucukBulma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen sayi adedini giriniz");
        int sayiAdet = klavye.nextInt();
        int[] sayilar = new int[sayiAdet];
        for(int k = 0;k<sayilar.length; k++){
            System.out.println("Lütfen "+(k+1)+". sayiyi giriniz");
            sayilar[k] = klavye.nextInt();
        }
        int ek = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] < ek) {
                ek = sayilar[i];
            }
        }
        System.out.println("Girilen en küçük sayi: "+ek);
    }
}