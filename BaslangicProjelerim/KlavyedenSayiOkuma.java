import java.util.Scanner;
public class KlavyedenSayiOkuma {
	public static void main(String args[]) {
		// Scanner nesnesini olustur
		Scanner klavye = new Scanner(System.in);
		//klavyeden alınan ilk değer
		System.out.println("Lütfen bir sayı giriniz");
		//klavyeden alınan değer int olarak alınıyor
		int Sayi1 = klavye.nextInt();
		System.out.println("Lütfen başka bir sayı giriniz");
		int Sayi2 = klavye.nextInt();
		System.out.println("1.girilen sayı: "+Sayi1);
		System.out.println("2.girilen sayı: "+Sayi2);
		if(Sayi1>Sayi2) {
			System.out.println("1.sayı 2.sayıdan büyüktür");
		}else if(Sayi1<Sayi2) {
			System.out.println("1.sayı 2.sayıdan küçüktür");
		}else{
				System.out.println("1.sayı 2.sayıya eşittir");
		}			
	}	
}	