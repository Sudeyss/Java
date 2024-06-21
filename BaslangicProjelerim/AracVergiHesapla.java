import java.util.Scanner;
public class AracVergiHesapla {
	public static void main(String [] args) {
		Scanner klavye = new Scanner (System.in);
		int motorHacmi, yas;
		float vergiTutar;
		System.out.println("Lütfen araç motor hacmi giriniz");
		motorHacmi = klavye.nextInt();
		System.out.println("Lütfen araç yaşı giriniz");
		yas = klavye.nextInt();
		if ((motorHacmi<=1300) && ((1<=yas) && (yas<=3)))
			System.out.println("1051 TL vergi ödemeniz var.");
		if ((motorHacmi<=1300) && ((4<=yas) && (yas<=6)))
			System.out.println("733 TL vergi ödemeniz var.");
		}
}		