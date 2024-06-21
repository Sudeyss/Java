import java.util.Scanner;

public class OgrenciGectiKaldi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen ogrenci sayisin1 giriniz");
		int sayiAdet = klavye.nextInt();
		int[] sayilar = new int[sayiAdet];
		int toplam = 0;
		float ortalama = 0f;
		for (int k = 0; k < sayilar.length; k++) {
			System.out.println("Lütfen " + (k + 1) + ".ögrencinin notunu giriniz");
			sayilar[k] = klavye.nextInt();
		}
		for (int k = 0; k < sayilar.length; k++) {
			toplam = sayilar[k] + toplam;
		}
		System.out.println("Girilen notlar");
		for (int k = 0; k < sayilar.length; k++) {
			System.out.print(sayilar[k] + "\t");
		}
		System.out.println("");
		ortalama = toplam / sayilar.length;
		System.out.println("Klavyeden girilen notlarin ortalaması = " + ortalama);
		System.out.println("Ortalamanin altinda kalan notlar");
		for (int k = 0; k < sayilar.length; k++) {
			if (sayilar[k] < ortalama) {
				System.out.print(sayilar[k] + "\t");
			}
		}
	}
}