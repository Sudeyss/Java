import java.util.Scanner;
public class KlavyedenDegerOkuma {
	public static void main(String args[]) {
		// Scanner nesnesini olustur
		Scanner klavye = new Scanner(System.in);
		//klavyeden alınan ilk değer
		String Isim = klavye.next();
		System.out.println("Isminiz : " + Isim);
		//klavyeden alınan değer int olarak alınıyor
		int Sayi = klavye.nextInt();
		System.out.println("Girilen Sayi: "+ Sayi);
	}	
}	