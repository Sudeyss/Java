import java.util.Scanner;

public class FaktoriyelHesapla {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı giriniz. ");
		int sayi =klavye.nextInt();
		long faktoriyel =1;
		//faktöriyel hesaplama
		for (int i=1; i<= sayi; i++) { //BU SATIRI KONTROL ET KÜÇÜK EŞİTTİR KISMI !
		faktoriyel *= i;
		}
			System.out.println(sayi + " sayısının faktöriyeli " + faktoriyel);
	}
}