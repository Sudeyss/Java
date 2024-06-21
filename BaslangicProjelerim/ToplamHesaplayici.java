import java.util.ArrayList;
import java.util.Scanner;

public class ToplamHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("Sayıları girin (bitirmek için 0 girin):");

        // Kullanıcı 0 girene kadar sayıları al 0 girince sistemi sona erdirr
        while (true) {
            int sayi = scanner.nextInt();
            if (sayi == 0) {
                break;
            }
            sayilar.add(sayi);
        }
		
		int toplam=0;
		
		for(int sayi : sayilar) {
			toplam= toplam + sayi;
		}
		
		System.out.println("Sayıların Toplamı: " + toplam);
	}
}
