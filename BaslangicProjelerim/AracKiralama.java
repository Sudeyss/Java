import java.util.Scanner;

public class AracKiralama {
	public static void main (String[] args) {
		Scanner klavyedengirilendeger = new Scanner(System.in);
		System.out.println("Lütfen Yaşınızı Giriniz");		
		int yas = klavyedengirilendeger.nextInt();
		
		if (yas<18) {
		System.out.println("Maalesef araç kiralayamazsınız");
		}
		else if (18<= yas && yas<=21) {
		System.out.println("Sadece ekonomik sınıf araçlar kiralayabilirsiniz");
		}	
		else if (21< yas && yas<=25) {
		System.out.println("Sadece ekonomik sınıf araçlar kiralayabilirsiniz");
		}	
		else {
		System.out.println("Tüm araçları kiralayabilirsiniz");
		}
	}
}	
	